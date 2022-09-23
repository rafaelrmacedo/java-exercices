/*
Construa um programa que declare um vetor de inteiros com 10 elementos e o inicialize
com números fornecidos pelo usuário, através da entrada padrão.
 */

import java.util.Scanner;

public class Exercise01_and_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array = new int[10];

        for(int i = 1; i <= Array.length; i++){
            System.out.printf("Type a number to the array at %d position: ", i);
            Array[i] = input.nextInt();
        }

        for(int i = 1; i <= Array.length;i++){
            System.out.printf("The %d position in the array value is: %d \n", i, Array[i]);
        }

    }
}
