/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmacedo_prova12;

import javax.swing.JOptionPane; 
import java.lang.Math.*;

public class Calculate {
    int  i;
    int n1;

    public void Multiplication(int n1){

        for (i = 0; i <= 10; i++){

            JOptionPane.showMessageDialog(null, n1 + " x " + i + " = " + n1*i);

        }

    }

    public void Factorial(int n1) {

        int result = 1;

        while (n1 > 1) {

               result = result * (n1);
               n1--;
        }

        JOptionPane.showMessageDialog(null, "The factorial number is: " + result);

    }

    public void Square(int n1){

        double result = 0;

        result = n1 * n1;

        JOptionPane.showMessageDialog(null, "The number squared is: " + result);
    }
    
    public void SquareRoot(int n1){
        
        double result = Math.sqrt(n1);
        
        JOptionPane.showMessageDialog(null, "The square root is: " + result);
    }
}

