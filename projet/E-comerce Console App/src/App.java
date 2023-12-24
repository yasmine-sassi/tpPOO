import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        UserService userService= new UserService();
        ProductService productService= new ProductService();
        User currentUser = null;

        // User authentication
        System.out.println("Enter username:(admin1/user1)");
        String username = scanner.nextLine();
        System.out.println("Enter password:(admin123/user123)");
        String password = scanner.nextLine();

        currentUser = userService.authenticateUser(username, password);

        if (currentUser != null) {
            System.out.println("Welcome, " + currentUser.getUsername() + "!");

            if (currentUser.getRole().equals("admin")) {
                //Admin menu
                showAdminMenu(scanner, productService);
            } else {
                //Customer menu
                showCustomerMenu(scanner, productService, currentUser);
            }
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }
    }

    public static void showAdminMenu(Scanner scanner, ProductService productService) {
        int choice = 0;
        do {
            System.out.println("*******************");
            System.out.println("Admin Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");
            System.out.println("*******************");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                
                case 1:
                //add product
                    System.out.println("choose a category(electronic/makeup/house) : ");
                    String categ=scanner.nextLine().toLowerCase();
                    switch(categ){
                        case "electronic": 
                            ElectronicProduct prod=new ElectronicProduct();
                            productService.addProduct(prod);
                            break;
                        case "makeup":
                            MakeupProduct prod1=new MakeupProduct();
                            productService.addProduct(prod1);
                            break;
                        case "house": 
                            HouseProduct prod2=new HouseProduct();
                            productService.addProduct(prod2);
                            break;
                        default: System.out.println("No matching category found");
                    }
                    
                    break;
                case 2:
                //update product
                    System.out.println("please provide the name of the product to update : ");
                    String nm=scanner.nextLine();
                    Product p=productService.look(nm);
                    productService.updateProduct(p);
                    break;
                case 3:
                //delete product
                    System.out.println("please provide the name of the product to delete : ");
                    String nmm=scanner.nextLine();
                    Product pp=productService.look(nmm);
                    productService.deleteProduct(pp);
                    break;
                
                case 4:
                    System.out.println("See ya!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public static void showCustomerMenu(Scanner scanner, ProductService productService,User currentUser) {
        int choice = 0;
        ShoppingCart shoppingCart=new ShoppingCart();
        Order order=new Order(currentUser);
        do {
            System.out.println("************************************");
            System.out.println("Customer Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Search Products");
            System.out.println("3. Filter Products by price range");
            System.out.println("4. View Cart");
            System.out.println("5. Add Item to Cart");
            System.out.println("6. Update quantity of an item");
            System.out.println("7. Remove item from Cart");
            System.out.println("8. Order");
            System.out.println("9. Checkout");
            System.out.println("10. Exit");
            System.out.println("************************************");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // View Products
                    productService.printProds();
                    break;
                case 2:
                    // Search Products
                    ArrayList<Product>prods;
                    String key;
                    System.out.println("enter the keyword: ");
                    key=scanner.nextLine();
                    prods=productService.searchProductsByKeyword(key);
                    if(prods !=null){
                        for (Product product : prods) {
                        product.displayInfo();
                        }
                    }
                    else{
                        System.out.println("No match found");
                    }
                    break;
                case 3:
                    // Filter Products
                    double min,max;
                    ArrayList<Product>prods1;
                    System.out.println("Minimum price: ");
                    min=scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Maximum price: ");
                    max=scanner.nextDouble();
                    scanner.nextLine();
                    prods1=productService.filterProductsByPriceRange(min, max);
                    if(prods1 !=null){
                        for (Product product : prods1) {
                        product.displayInfo();
                        }
                    }
                    else{
                        System.out.println("No products found between "+min+"DT and "+max+"DT");
                    }
                    break;
                case 4:
                    // View Cart
                    shoppingCart.displayShoppingCart();
                    break;
                case 5:
                    //Add Item to Cart
                    String n;int q;
                    Product searched;
                    System.out.println("name of the item to add: ");
                    n=scanner.nextLine();
                    System.out.println("quantity of the item to add: ");
                    q=scanner.nextInt();
                    scanner.nextLine();
                    searched=productService.look(n);
                    if(searched !=null){
                        shoppingCart.addItem(searched, q);
                    }
                    else{
                        System.out.println("item not found");
                    }
                    break;
                case 6:
                    //Update quantity of an item
                    String n1;int q1;
                    Product ss;
                    System.out.println("name of the item to update: ");
                    n1=scanner.nextLine();
                    System.out.println("the new quantity: ");
                    q1=scanner.nextInt();
                    scanner.nextLine();
                    ss=productService.look(n1);
                    if(ss !=null){
                        shoppingCart.updateItemQuantity(ss, q1);
                    }
                    else{
                        System.out.println("item not found");
                    }

                    break;
                case 7:
                    //Remove item from Cart
                    String n2;
                    Product s1;
                    System.out.println("name of the item to remove: ");
                    n2=scanner.nextLine();
                    s1=productService.look(n2);
                    if(s1 !=null){
                        shoppingCart.removeItem(s1);
                        System.out.println("Item removed successfully");
                    }
                    else{
                        System.out.println("item not found");
                    }

                    break;
                case 8:
                    //Order
                    boolean b=order.addItemsFromCart(shoppingCart);
                    if(b){
                        System.out.println("Your cart is ready to order");
                        System.out.println();
                        order.displayOrderDetails();
                        System.out.println();
                        System.out.println("Do you have a discount code? Y/N: ");
                        String c= scanner.nextLine().trim().toUpperCase();
                        do{
                            switch(c){
                                case "Y": 
                                    System.out.println("Discount code(DISC01/SOLDE11): ");
                                    String cc=scanner.nextLine();
                                    order.applyDiscount(cc);
                                    System.out.println("your new total amount is "+order.getTotalamount()+"DT");
                                    break;
                                case "N":System.out.println("No problem!"); break;
                                default: System.out.println("wrong answer try again");
                            }

                        }while(c !="Y" && c!="N");
                    }
                    break;
                case 9:
                    //payment
                    System.out.println("do you want to checkout Now or Later N/L: ");
                    String nn= scanner.nextLine().trim().toUpperCase();
                    if(nn.equals("N")){
                        order.checkout();
                    }
                    else{
                        System.out.println("okay!");
                    }
                    break;
                case 10:
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);
    }
}
