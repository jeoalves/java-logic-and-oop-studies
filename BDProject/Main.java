import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(Connection connection = DBProject.connect()){
            ProductDAO productDAO = new ProductDAO(connection);

            showProducts(productDAO);
            Product product1 = new Product("Mouse", 10, 19.99, "On Stock");
            Product product2 = new Product("MousePad", 30, 9.99, "On Stock");
            Product product3 = new Product("Keyboard", 5, 39.99, "On Stock");

            productDAO.insert(product1);
            productDAO.insert(product2);
            productDAO.insert(product3);

            showProducts(productDAO);

            Product consultProduct = productDAO.getByID(1);
                if(consultProduct != null){
                    System.out.println("Product founded: " + consultProduct.getName());
                }else{
                    System.out.println("Product not found");
                }
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void showProducts(ProductDAO productDAO){
    List<Product> allProducts = productDAO.listAll();
    if(allProducts.isEmpty()){
        System.out.println("The list is empty");
    }else{
        System.out.println("Products: ");
        for(Product p : allProducts){
            System.out.println(p.getId() + ": " + p.getName() + " - " + p.getPrice());
        }
    }
}

}

