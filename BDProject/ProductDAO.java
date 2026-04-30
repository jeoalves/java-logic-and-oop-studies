import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private final Connection CONNECTION_DB;

    public ProductDAO(Connection connection){
        this.CONNECTION_DB = connection;
    }

    public void insert(Product product){
        String sql = "INSERT INTO products (name_product, quantity, price, status) VALUES (?, ?, ?, ?)";
        try(PreparedStatement stmt = CONNECTION_DB.prepareStatement(sql)){
            stmt.setString(1,product.getName());
            stmt.setInt(2, product.getQuantity());
            stmt.setDouble(3,product.getPrice());
            stmt.setString(4, product.getStatus());
            stmt.executeUpdate();
        }catch(SQLException e){
            System.err.println("Insert product fail" + e.getMessage());
        }
    }

    public void deleteAll(){
        String sql = "DELETE FROM products";
        try(PreparedStatement stmt = CONNECTION_DB.prepareStatement(sql)){
            stmt.executeUpdate();
        }catch(SQLException e){
            System.err.println("Delete all fail " + e.getMessage());
        }
    }

    public Product getByID(int id){
        String sql = "SELECT * FROM products WHERE id_product= ?";
        try(PreparedStatement stmt = CONNECTION_DB.prepareStatement(sql)){
            stmt.setInt(1,id);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    Product product = new Product();
                    product.setId(rs.getInt("id_product"));
                    product.setName(rs.getString("name_product"));
                    product.setQuantity(rs.getInt("quantity"));
                    product.setPrice(rs.getDouble("price"));
                    product.setStatus(rs.getString("status"));
                    return product;
                }
            }
        } catch(SQLException e){
            System.err.println("Get from ID fail " + e.getMessage());
        } return null;
    }       


    public void update(Product product){
        String sql = "UPDATE products SET name_product = ?, quantity = ?, price = ?, status = ? WHERE id_product = ?";
        try(PreparedStatement stmt = CONNECTION_DB.prepareStatement(sql)){
            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getQuantity());
            stmt.setDouble(3, product.getPrice());
            stmt.setString(4, product.getStatus()); 
            stmt.setInt(5, product.getId());
            stmt.executeUpdate(); 
        }catch (SQLException e){
            System.err.println("Update products fail:  " + e.getMessage());
        }
    }

    public void delete(int id){
        String sql = "DELETE FROM products WHERE id_product = ?";
        try(PreparedStatement stmt = CONNECTION_DB.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch(SQLException e){
            System.err.println("Delete product fail: " + e.getMessage());
        }
    }

    public List <Product> listAll(){
        List <Product> products = new ArrayList <>();
        String sql = "SELECT * FROM products";
        try(PreparedStatement stmt = CONNECTION_DB.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    Product product = new Product();
                    product.setId(rs.getInt("id_product"));
                    product.setName(rs.getString("name_product"));
                    product.setQuantity(rs.getInt("quantity"));
                    product.setPrice(rs.getDouble("price"));
                    product.setStatus(rs.getString("status"));
                    products.add(product);
                }
            }catch (SQLException e){
                System.err.println("List products fail: " + e.getMessage());
            }
            return products;
    } 
}

