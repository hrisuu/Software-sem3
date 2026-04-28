package inheritance;

public class clothingProduct extends Product{
    private String size;
    private String fabric;

    //Constructor
    public clothingProduct(String name, double price, int quantity, String size, String fabric){
        super(name, price, quantity); //calling the super class constructor
        this.size = size;
        this.fabric=fabric;
    }

    //setter and getter methods
    public String getSize(){
        return size;
    }

    public void setSize(){
        this.size=size;
    }

    public String fabric(){
        return fabric;
    }

    public void setFabric(){
        this.fabric=fabric;
    }

    //display method: method overriding
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Name= "+super.getName());
        System.out.println("Size= "+this.size);
        System.out.println("Size="+fabric);
    }
}


//electronic class banayera garne 