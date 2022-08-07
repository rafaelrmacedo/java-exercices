/* 3– Crie uma classe ContaCorrente, esta classe deve herdar Conta e deve ter o seguinte
atributo:
a) valorManutenção: Int

A conta Corrente deverá ter os seguintes métodos:

a) Ao criar uma Conta já deve ser passado o valor da Manutenção (Método Construtor)
b) Métodos set e get para valorManutenção
c) EfetuarManutenção () - Ao chamar este método deve ser descontado do saldo da conta o
valor da Manutenção. */
package exercices.BankExercice;

public class CheckingAccount extends BankAccount{
    
    private int maintenanceValue;

    public CheckingAccount(String customer, int accountNumber, float balance, int maintenanceValue) {
        super(customer, accountNumber, balance);
        this.maintenanceValue = maintenanceValue;
    }

    public int getMaintenanceValue() {
        return maintenanceValue;
    }

    public void setMaintenanceValue(int maintenanceValue) {
        this.maintenanceValue = maintenanceValue;
    }

    public void executeMaintenance(){
        balance = balance - maintenanceValue;
    }
}
