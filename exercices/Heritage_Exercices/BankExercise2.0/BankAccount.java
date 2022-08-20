/* 1– Crie uma classe ContaBancaria com as seguintes características
a) cliente: String
b) número da conta: inteiro
c) saldo: float

Métodos da ContaBancária:

a) Ao criar uma conta já deve ter um cliente e um número (Método Construtor), uma
conta deve iniciar com saldo em Zero.
b) Gere métodos Getters para os 3 atributos acima.
a) sacar(): este método deve receber um parâmetro (número inteiro), ao sacar deve ser
verificado o saldo, o saldo não pode ficar negativo.
b) depositar(): este método deve receber um parâmetro (número inteiro) e incrementar
o saldo. */
package exercices.Heritage_Exercices;

public class BankAccount {
    private String customer;
    private int accountNumber;
    protected float balance;

    public BankAccount(String customer, int accountNumber,float balance) {
        balance = 0;
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
