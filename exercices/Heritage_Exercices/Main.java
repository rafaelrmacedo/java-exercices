package exercices.Heritage_Exercices;

public class Main{
    public static void main(String[] args) {
        BankAccount bc1 = new BankAccount("Rafael", 220304, 0);

        bc1.deposit(1000);
        System.out.print("A quantidade do deposito foi de %d reais", bc1.deposit(1000));
    }  
}
