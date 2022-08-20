package exercices.Heritage_Exercices.Bank;

public class AgressiveInvestAccount extends InvestAccount{

    public AgressiveInvestAccount(String customer, int accountNumber, float balance, float totalIncome, float income) {
        super(customer, accountNumber, balance, totalIncome, income);
    }
    
    public void generateIncome(){
        income = 0.2f;
        balance = balance + income;
        totalIncome = balance;
    }
    public void lostIncome(){
        income = 0.2f;
        balance = balance - income;
        totalIncome = balance;
    }
    public void beRich(){
        balance = 1000000f;
    }
    public void bePoor(){
        balance = 0;
    }
}
