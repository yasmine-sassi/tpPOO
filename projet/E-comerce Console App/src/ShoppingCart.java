import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }
    // Method to add an item to the cart
    public void addItem(Product product, int quantity) {
        int availableStock = product.getAvailableStock();
        if (availableStock >= quantity) {
            for (CartItem item : cartItems) {
                if (item.getProduct().equals(product)) {
                    item.setQuantity(item.getQuantity() + quantity);
                    return;
                }
            }
            // If the product is not in the cart add a new cart item
            cartItems.add(new CartItem(product, quantity));
        } else {
            System.out.println("Insufficient stock! Available stock for " + product.getName() + ": " + availableStock);
        }
    }

    // Method to update the quantity of an item in the cart
    public void updateItemQuantity(Product product, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getProduct().equals(product)) {
                item.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Item not found. Try again!");
    }

    // Method to remove an item from the cart
    public void removeItem(Product product) {
        for (CartItem item : cartItems) {
            if (item.getProduct().equals(product)) {
                cartItems.remove(item);
                return;
            }
        }
    }

    // Method to get all items in the cart
    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public void displayShoppingCart(){
        if(cartItems.isEmpty()){
            System.out.println("Empty cart!");
        } 
        for (CartItem item : cartItems) {
            System.out.println("added "+item.getQuantity()+" of "+item.getProduct().getName());
        }
    }
}
