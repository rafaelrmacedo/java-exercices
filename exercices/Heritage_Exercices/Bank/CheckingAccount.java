
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
