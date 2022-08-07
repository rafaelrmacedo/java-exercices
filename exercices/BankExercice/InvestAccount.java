package exercices.BankExercice;

public class InvestAccount extends SavingsAccount{

    public InvestAccount(String customer, int accountNumber, float balance, float totalIncome, float income) {
        super(customer, accountNumber, balance, totalIncome, income);
    }
    public void generateIncome(){
        income = 0.1f;
        balance = balance + income;
        totalIncome = balance;
    }
    
}
