/*
    Crie um programa, utilizando busca sequencial para localizar um
    valor qualquer dentro do vetor e informe se o numero existe ou não
    no vetor
*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
    Integer[] numbers = new Integer[]{32, 4532, 643, 53, 897, 54, 87, 3, 7, 8, 90, 2, 43, 91};    
    Scanner input = new Scanner (System.in);
    int guess = 0;
    
    for(int i = 0; i <= numbers.length; i++){

        List<Integer> list = Arrays.asList(numbers);

            System.out.println("Type a number that you guess have in the array: ");
            guess = input.nextInt();
            System.out.println((list.contains(i)));
                
        }
    }
}
