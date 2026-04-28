package inheritance;
// import java.util.jar.Attributes.Name;

public class Product{
    private String name;
    private double price;
    int quantity;

    //constructor to initialize instance variable
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //setter and getter methods
    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name=name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    //display methods
    public void displayDetails(){
        System.out.println("Product Name: "+name);
        System.out.println("Price" +price);
        System.out.println("Quantity: "+quantity);
    } 
}