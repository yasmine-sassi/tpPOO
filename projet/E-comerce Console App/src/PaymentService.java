//This class is supposed to check the balance of a bank account
public class PaymentService {
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of " + amount+"DT");
        boolean paymentSuccess = true; 
        //paymentSuccess=false if the balance is less than the amount 
        return paymentSuccess;
    }
}
