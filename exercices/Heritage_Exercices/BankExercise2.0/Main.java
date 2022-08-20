/* 4– Crie no programa principal 2 contas em seu nome, uma poupança e uma corrente. (Para
isso crie 2 objetos diferentes já passando seu nome e o número da conta. */
package exercices.Heritage_Exercices;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //CheckingAccount checkingAccount = new CheckingAccount("Rafa", 34567, 1000, 20);
        //SavingsAccount savingAccount = new SavingsAccount("Rafa", 34568, 1000, 1050, 0.05f);
        Scanner in = new Scanner(System.in);

        System.out.println("Choose a option below:");
        System.out.println("1 - Checking Account");
        System.out.println("2 - Savings Account");
        int number = in.nextInt();

        if (number == 1){
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Show Balance");
            System.out.println("4 - Generate Income");
            System.out.println("5 - Back"); 
            
        } else {
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Show Balance");
            System.out.println("4 - Execute Maintenance");
            System.out.println("5 - Change Maintenance Value");
            System.out.println("6 - Back"); 
        }
        
    }  
}
