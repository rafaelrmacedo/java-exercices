/* 
    Crie um programa, utilizando vetor, inclua a nota de 10 ALUNOS
    Imprima a Maior Nota
    Média da turma
    Nota mais Baixa
*/

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] grades = new int[10]; //array w/ 10 positions
            int biggestGrade = 0;
            int lowestGrade = 0;
            int average = 0;
            int classGrades = 0;

            for(int i = 1; i <= 10; i++){
                System.out.println("Type a grade for a student: ");
                grades[i] = input.nextInt();
                
                classGrades = classGrades + grades[i];

                if(grades[i] > grades[i--]){
                    biggestGrade = grades[i];
                } 
                if (grades[i] < grades[i--]){
                    lowestGrade = grades[i];
                }
            }

            average = classGrades / 10;

            System.out.printf("Biggest class grade: %d \n", biggestGrade);
            System.out.printf("Lowest class grade: %d \n", lowestGrade);
            System.out.printf("Average class grade: %d \n", average);
        }
    }

}

