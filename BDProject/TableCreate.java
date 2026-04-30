import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
    public static void main(String[] args) {
        try (Connection connection = DBProject.connect();
        Statement stmt = connection.createStatement()){

        String SQLCommand = "CREATE TABLE products (" +
                            "id_product INTEGER PRIMARY KEY," +
                            "name_product TEXT NOT NULL," + 
                            "quantity INTEGER," + 
                            "price REAL," + 
                            "status TEXT" +
                            ");";
        System.out.println(SQLCommand);  
        stmt.execute(SQLCommand);
        System.out.println("'Products' table created sucessfully !");
        
        } catch (SQLException e){
            System.err.println("Table creation fail: " + e.getMessage());
            e.printStackTrace(); //show where is the error
        }
    }
    
}
