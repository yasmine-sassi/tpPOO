public class HouseProduct extends Product{
    public static final String category="house";

    public HouseProduct() {
        super();
    }

    public HouseProduct(String name, double price, int availableStock) {
        super(name, price, availableStock);
    }

    public String getCategory() {
        return category;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Category: " + category);
        System.out.println();
    }
}
