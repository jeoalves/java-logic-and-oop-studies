import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProject {
    private static final String URL_JDBC_DEFAULT = "jdbc:sqlite:my_data_base.db";
    
    //connection standard method
    public static Connection connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(URL_JDBC_DEFAULT);
        }catch(SQLException | ClassNotFoundException e){
            System.err.println("Connection fail: " + e.getMessage());
            return null;
        }
    }
    //connection with URL, user and password 
    public static Connection defaultConnect(String url, String user, String password){
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(url, user, password);
        }catch(SQLException | ClassNotFoundException e){
            System.err.println("Connection fail: " + e.getMessage());
            return null;
        }

    }
}