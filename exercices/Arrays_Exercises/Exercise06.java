/*
    Escreva um programa que receba dois conjuntos de números , vetores,
    (podem ter o tamanho diferente).
    Liste os dois vetores
    Crie um outro vetor para armazenar os dois conjuntos unidos,
    sendo que não devem haver números repetidos . Finalmente, exiba este vetor resultante
*/

//import java.util.Scanner;
import java.util.Arrays;

public class Exercise06 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int[] primaryArray = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] secondArray = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int length = primaryArray.length + secondArray.length;
        int[] thirdArray = new int[length];
        int i = 0;

        for(i = 0; i < primaryArray.length; i++){
            System.out.printf("%d - ", primaryArray[i]);
        }
            System.out.println("Array 1 values \n ");

        for(i = 0 ;i < secondArray.length; i++){
            System.out.printf("%d - ", secondArray[i]);
        }
            System.out.println("Array 2 values \n");

        int position = 0;
        for (int value : primaryArray)
        {
            thirdArray[position] = value;
            position++;
        }
        for (int value : secondArray)
        {
            thirdArray[position] = value;
            position++;
        }

        System.out.printf("Both arrays together as a third array: " + Arrays.toString(thirdArray) + "\n");

    }
}
