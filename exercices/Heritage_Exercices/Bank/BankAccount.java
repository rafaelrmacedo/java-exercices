
package exercices.BankExercice;

public class BankAccount {
    private String customer;
    private int accountNumber;
    protected float balance;

    public BankAccount(String customer, int accountNumber,float balance) {
        balance = 0;
        this.balance = balance;
        this.customer = customer;
        this.accountNumber = accountNumber;
    }

    public BankAccount(float income, float totalIncome) {
    }

    public String getCustomer() {
        return customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    //para sacar o dinheiro

    public void withDraw(int value){
        if (balance < 0){
            System.out.println("Insufficient funds!");
        } else {
            balance = balance - value;
        }
    }

    // depositar o dinheiro
    
    public void deposit(int value){
        balance = balance + value;
    }



}
