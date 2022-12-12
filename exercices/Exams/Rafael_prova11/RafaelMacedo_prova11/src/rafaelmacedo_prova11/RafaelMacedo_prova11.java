/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelmacedo_prova11;

import javax.swing.JOptionPane;

public class RafaelMacedo_prova11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Grades grad = new Grades();
        
        grad.CalculateGrades();
        grad.ShowApprovedStudents();
        grad.ShowGrades();
        grad.ShowRecuperationStudents();
        grad.ShowAverageGrades();
        
    }
    
}
