import java.util.Scanner;


public abstract class Product {
    private String name;
    private double price;
    private int availableStock;
    public Product(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide the product's name:");
        this.name=scanner.nextLine();
        System.out.println("provide the product's price:");
        this.price=scanner.nextDouble();
        System.out.println("provide the product's available Stock:");
        this.availableStock=scanner.nextInt();
    }
    public Product(String name,double price,int availableStock) {
        this.name=name;
        this.price=price;
        this.availableStock = availableStock;
    }
    public abstract String getCategory();

    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public int getAvailableStock() {
        return availableStock;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public void updateStock(int quantitySold) {
        if (availableStock >= quantitySold) {
            availableStock -= quantitySold;
        } else {
            availableStock = 0;
            System.out.println("Warning: Product is out of stock!");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price+"DT");
        System.out.println("Quantity: " + availableStock);
    }
    
}