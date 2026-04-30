import org.json.JSONObject;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WeatherInfoRealTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the name of the city: ");
        String city = scanner.nextLine(); //scanner get the data from the user
        
        try {
            String dataWeather = getDataWeather(city); //get JSON
            //if return 1006 means the name of the city is wrong
            if (dataWeather.contains("\"code\":1006")) { 
                System.out.println("City not found, please write again: ");                
            } else {
                printDataWeather(dataWeather);
            }

        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    
    public static String getDataWeather(String city)throws Exception{
        String apiKey = Files.readString( Paths.get("apiKey.txt")).trim(); 
        //read the txt using files and path library
        String nameOfTheCityFormat = URLEncoder.encode(city, StandardCharsets.UTF_8);
        //transf the users city into URL code ex "Sao Paulo" to "Sao+Paulo" 
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + nameOfTheCityFormat; 
        //create an URL with the city info
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(apiUrl)) // create a new request
        .build();
    
        HttpClient client = HttpClient.newHttpClient();  
        //create the client (the sender of the request)

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //save the information at the 'response' 

        return response.body();
    }

    public static void printDataWeather(String data){
        //using JSON library to extract data
        JSONObject dataJSON = new JSONObject(data); //get JSON
        JSONObject infoWeather = dataJSON.getJSONObject("current"); //get "current data" from the API

        //Location data
        String city = dataJSON.getJSONObject("location").getString("name"); //check the city name
        String country = dataJSON.getJSONObject("location").getString("country"); //check the country

        //Weather data
        String weatherConditions = infoWeather.getJSONObject("condition").getString("text");  
        int humidity = infoWeather.getInt("humidity"); //int dont need .getString
        float wind = infoWeather.getFloat("wind_kph");
        float pressure = infoWeather.getFloat("pressure_mb");
        float feelsLike = infoWeather.getFloat("feelslike_c");
        float temperature = infoWeather.getFloat("temp_c");

        //get date and hour
        String dateandHour = infoWeather.getString("last_updated");
        
        //print current info
        System.out.println("Data Weather from " + city + ", " + country);
        System.out.println("Date and hour: " + dateandHour);
        System.out.println("Current temperature: " + temperature + "C");
        System.out.println("Feels like: " + feelsLike + "C");
        System.out.println("Conditions: " + weatherConditions);
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Wind: " + wind + " km/h");
        System.out.println("Pressure: " + pressure + " mb");

    }

}
