public class TestBank {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(123,"yasmine",85213);
        b.deposit(50); 
        b.affiche();
        b.withdraw(1000);
        System.out.println("remaining: "+b.getBalance());
    }
}
