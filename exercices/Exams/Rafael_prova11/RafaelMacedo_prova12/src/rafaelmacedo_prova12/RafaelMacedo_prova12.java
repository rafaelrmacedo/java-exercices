/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmacedo_prova12;

import javax.swing.JOptionPane;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class RafaelMacedo_prova12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 1;
        Calculate calc = new Calculate();
        
        while(option != 0){
            
            option = 0;
            
           try{
    
            int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Type an number to calculate"));
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Type an option below (1 - Multiplication Table, 2 - Factorial, 3 - Cube, 4 - Square Root, 0 - Exit)"));
            
            switch (option){
                case 1:
                    calc.Multiplication(number);
                    break;
                    
                case 2:
                    calc.Factorial(number);
                    break;
                    
                case 3:
                    calc.Square(number);
                    break;
                    
                case 4:
                    calc.SquareRoot(number);
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Thanks for using our system!");
                    break;
            }   
                
            }
            catch(Exception exception){
              JOptionPane.showMessageDialog(null, "ERROR! Type a valid integer number.",
              "Hey!", JOptionPane.ERROR_MESSAGE);
            } 
        }
        
    }
    
}
