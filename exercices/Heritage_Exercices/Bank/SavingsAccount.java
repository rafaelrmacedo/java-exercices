
package exercices.Heritage_Exercices.Bank;

public class SavingsAccount extends BankAccount{

    //income é o rendimento
    protected float income;
    protected float totalIncome; 

    public SavingsAccount(String customer, int accountNumber, float balance, float totalIncome, float income) {
        super(income, totalIncome);
        this.income = income;
        this.totalIncome = totalIncome;
    }

    public float getIncome() {
        return income;
    }

    public float getTotal() {
        return totalIncome;
    }

    public void incomeGenerate(){
        income = 0.005f;
        balance = balance + income;
        totalIncome = balance;
    }
}
