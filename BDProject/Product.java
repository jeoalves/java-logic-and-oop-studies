public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String status;

    public Product(String name, int quantity, double price, String status){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }
    public Product(){
        //empty constructor need getters and setters
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    
}
