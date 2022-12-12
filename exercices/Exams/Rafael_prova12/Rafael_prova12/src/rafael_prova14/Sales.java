/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafael_prova14;

import javax.swing.JOptionPane;

public class Sales {
    
    public void StartSystem(){
        
       int confirm = 0;
        
            
            double buyPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the product sale price: "));
            double profit = Double.parseDouble(JOptionPane.showInputDialog(null, "Type the % of profit (lucro): "));
    
            double profitPercentage = profit / 100;
            
            double salePrice = buyPrice + (buyPrice * profitPercentage); 
       
            JOptionPane.showMessageDialog(null, "The sale price is " + salePrice, "Sale Price", JOptionPane.INFORMATION_MESSAGE);
       
            confirm = JOptionPane.showConfirmDialog(null, "Do you want continue?", "Confirm", JOptionPane.YES_NO_OPTION);
            
            if(confirm == 0){
                StartSystem();
            }
        
       
        
       
              
    }
    
    
    
    
}