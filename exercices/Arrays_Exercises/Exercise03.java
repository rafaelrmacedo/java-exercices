/*
    Escreva um programa que receba a nota de 10 alunos.
    Sabendo que os alunos com nota inferior a 5 estão reprovados, os alunos com nota
    superior a 6 estão aprovados Liste o total de alunos aprovados , o total de alunos em
    recuperação e os reprovados.
    Imprima as notas
 */

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] grades = new int[10]; //array w/ 10 positions
            int reprovedStudents = 0;
            int recuperationStudents = 0;
            int approvedStudents = 0;

            for(int i = 0; i < 10; i++){
                System.out.printf("Type a grade for the student number %d: \n", i);
                grades[i] = input.nextInt();
            }

            for(int i = 0; i < 10; i++){
                if(grades[i] < 5){
                    reprovedStudents++;
                } else if (grades[i] > 4 && grades[i] < 7){
                    recuperationStudents++;
                } else {
                    approvedStudents++;
                }
            }

            System.out.println("Students grades: \n");

            for(int i = 0; i < 10; i++){
                System.out.printf("Student number %d: %d \n", i, grades[i]);
            }
            
                System.out.printf("Number of reproved students was: %d \n", reprovedStudents);
                System.out.printf("Number of recuperation students was: %d \n", recuperationStudents);
                System.out.printf("Number of approved students was: %d \n", approvedStudents);
        }
            
    }
}
