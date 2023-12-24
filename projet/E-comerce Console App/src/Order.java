import java.util.ArrayList;
import java.util.Random;

public class Order {
    private static int orderIdCounter = 1;
    private int orderId;
    private ArrayList<CartItem> orderedItems;
    private double totalAmount;
    private User user; 
    private ArrayList<String> validDiscounts;
    private PaymentService paymentService;

    public Order(User user) {
        this.orderId = orderIdCounter++;
        this.user = user;
        this.orderedItems = new ArrayList<>();
        this.validDiscounts = new ArrayList<>();
        validDiscounts.add("DISC01");
        validDiscounts.add("SOLDE11");
        this.paymentService = new PaymentService();
    }

    private void calculateTotalAmount() {
        this.totalAmount = 0.0;
        for (CartItem item : orderedItems) {
            this.totalAmount += item.getProduct().getPrice() * item.getQuantity();
        }
    }

    public void applyDiscount(String discountCode) {
        if (validDiscounts.contains(discountCode)) {
                totalAmount = totalAmount*0.9;
                System.out.println("10% off applied successfully!");
        } else {
            System.out.println("Invalid discount code.");
        }
    }

    public double getTotalamount(){
        return totalAmount;
    }

    //add items from cart check if there s enough quantity or not
    public boolean addItemsFromCart(ShoppingCart cart) {
        if(cart.getCartItems().isEmpty()) {
            System.out.println("your cart is empty!");
            return false;
        }
        else{
            boolean alladded = true;
            for (CartItem item : cart.getCartItems()) {
                int availableStock = item.getProduct().getAvailableStock();
                if (availableStock >= item.getQuantity()) {
                    this.orderedItems.add(item);
                    item.getProduct().setAvailableStock(availableStock - item.getQuantity());
                } else {
                    alladded = false;
                    System.out.println("Insufficient stock for " + item.getProduct().getName() + ". Available stock: " + availableStock);
                }
            }
            if (alladded) {
                calculateTotalAmount();
                return true;
            } else {
                return false;
            }
        }
    }
    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User: " + user.getUsername());
        System.out.println("Total Amount: " + totalAmount+"DT");
        System.out.println("Ordered Items:");
        for (CartItem item : orderedItems) {
            System.out.println("- " + item.getProduct().getName() + " (Quantity: " + item.getQuantity() + ")");
        }
    }

    public void checkout() {
        if (paymentService == null) {
            paymentService = new PaymentService();
        }
        boolean paymentProcessed = paymentService.processPayment(totalAmount);
        if (paymentProcessed) {
            System.out.println("Payment processed successfully for Order ID: " + orderId);
        } else {
            //if the amount in the bank is less than the total amount  
            System.out.println("Payment failed for Order ID: " + orderId);
            return;
        }
        if (totalAmount > 200) {
            giveRandomPrize();
        }
    }

    private void giveRandomPrize() {
        Random random = new Random();
        int prizeNumber = random.nextInt(3);

        switch (prizeNumber) {
            case 0:
                System.out.println("Congratulations! You've won a gift card!");
                break;
            case 1:
                System.out.println("Congratulations! You've won a discount code!");
                break;
            case 2:
                System.out.println("Congratulations! You've won a free electronic product!");
                break;
            default:
                System.out.println("No prize won,til next time!");
                break;
        }
    }


}
