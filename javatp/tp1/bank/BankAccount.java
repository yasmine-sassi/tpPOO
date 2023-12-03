public class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    public BankAccount(int nb,String name,int bal){
            this.accountNumber=nb;
            this.accountHolderName=name;
            this.balance=bal;
        }
    public int getAccountNumber(){return this.accountNumber;}
    public String getAccountHolderName(){return this.accountHolderName;}
    public int getBalance(){return this.balance;}
    public void deposit(int amount){this.balance +=amount;}
    public void withdraw(int amount){this.balance -=amount;}
    public void affiche(){
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
    }
}
