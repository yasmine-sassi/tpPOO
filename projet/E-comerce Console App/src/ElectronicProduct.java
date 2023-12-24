public class ElectronicProduct extends Product{
    public static final String category="electronic";

    public ElectronicProduct() {
        super();
    }

    public ElectronicProduct(String name, double price, int availableStock) {
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
