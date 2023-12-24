import java.util.Scanner;
import java.util.ArrayList;

public class ProductService {
    //the inventory
    private ArrayList<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
        products.add(new ElectronicProduct("TV", 799.99, 80));
        products.add(new HouseProduct("Lamp", 29.95, 60));
        products.add(new MakeupProduct("Lipstick", 19.99, 100));
        products.add(new ElectronicProduct("Mouse", 39.50, 40));
        products.add(new MakeupProduct("Foundation", 24.99, 80));
        products.add(new ElectronicProduct("Mic", 89.99, 35));
        products.add(new HouseProduct("Table", 299.00, 40));
        products.add(new ElectronicProduct("Speakers", 59.95, 50));
        products.add(new ElectronicProduct("Camera", 399.99, 20));
        products.add(new ElectronicProduct("Blow Dryer", 499.50, 30));
    }

    // Method to add a new product(admins only)
    public void addProduct(Product product) {
        System.out.println("Added successfully");
        products.add(product);
    }

    // Method to retrieve all products
    public ArrayList<Product> getAllProducts() {
        return products;
    }

    // Method to update a product(admins only)
    public void updateProduct(Product updatedProduct) {
        System.out.println("What do you want to update?");
        System.out.println("Press N for name or P for price:");
        
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().trim().toUpperCase();

        switch (choice) {
            case "N":
                System.out.println("Enter the new name:");
                String newName = scanner.nextLine().trim();
                if (!newName.isEmpty()) {
                    updatedProduct.setName(newName);
                    System.out.println("Name updated successfully!");
                } else {
                    System.out.println("Invalid name entered. No changes made.");
                }
                break;
            case "P":
                System.out.println("Enter the new price:");
                   double newPrice = Double.parseDouble(scanner.nextLine().trim());
                    if (newPrice >= 0) {
                        updatedProduct.setPrice(newPrice);
                        System.out.println("Price updated successfully!");
                    } else {
                        System.out.println("Invalid price entered. No changes made.");
                    }
                break;
            default:
                System.out.println("Invalid choice. No changes made.");
                break;
        }
    }

    // Method to delete a product(admins only)
    public void deleteProduct(Product product) {
        System.out.println("Deleted successfully");
        products.remove(product);
    }
    public ArrayList<Product> searchProductsByKeyword(String keyword) {
        ArrayList<Product> matchedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                matchedProducts.add(product);
            }
        }
        return matchedProducts;
    }
    public ArrayList<Product> filterProductsByCategory(String category) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public ArrayList<Product> filterProductsByPriceRange(double minPrice, double maxPrice) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public void printProds(){
        for (Product product : products) {
        product.displayInfo();
        }
    }

    public Product look(String n){
        for (Product product : products) {
            if (product.getName().toLowerCase().equals(n.toLowerCase())) {
                return product;
            }
        }
        System.out.println("No product found");
        return null;
    }
}
