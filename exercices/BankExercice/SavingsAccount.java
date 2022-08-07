/* 2 – Crie uma classe ContaPoupança, esta classe deve herdar a classe ContaBancaria.
A conta Poupança deve ter os seguintes atributos:
a) rendimento: float
b) rendimento total: float

A contaPoupança deve ter os seguintes métodos:

a) Método getters para os dois atributos acima.
b) gerarRendimentos(): Este método deve ter as seguintes regras:
1 - ao ser executado, vai gerar um rendimento de 0,5% do saldo. Este rendimento
vai ser incrementado no atributo rendimento_total.
2 - O rendimento gerado será somado ao saldo. */
package exercices.BankExercice;

public class SavingsAccount extends BankAccount{

    //income é o rendimento
    private float income;
    private float totalIncome; 

    

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
