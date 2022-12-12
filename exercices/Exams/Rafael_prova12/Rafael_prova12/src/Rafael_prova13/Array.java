/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rafael_prova13;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class Array {
    int[] array = {80, 70, 55, 85, 60, 90, 75, 35, 28, 17, 14, 57};
    int existingValue = 0;
    int sum = 0;
    
    public void CheckIf28Exists(){
        for(int value : array){
            if(existingValue == 28){
               existingValue = value;
            }       
        }
        if(existingValue == 28){
            System.out.println("Yes, the number 28 exist in this array");
        }
        else{
            System.out.println("No, the number 28 doesn't exist in this array.");
        }
    }
    
    public void SumArrayValues(){
        
        for(int value : array){
            sum = sum + value;
        }
        
        System.out.printf("The sum using the values of the array is %d \n", sum);
        sum = 0;
    }
    
    public void MinorValue(){
        int minor = 99;
        
        for(int value : array){
            if(value > minor){
                minor = value;
            }
        }
        
        System.out.printf("The minor value in this array is %d \n", minor);
    }
    
    public void AverageArrayValues(){
            double average;
            
            for(int value : array){
                sum = sum + value;
            }
            
            average = sum / 10;
           
            System.out.printf("The average value in the array is %f \n", average);
    } 
    
    public void InvertedArray(){
        
        System.out.println("Inverted Array:");
        
        for(int c = array.length - 1; c >= 0; c--){
            System.out.print(array[c]);
        }
        
    }
        
}
