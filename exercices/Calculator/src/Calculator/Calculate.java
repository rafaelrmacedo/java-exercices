/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingDesign_Class1;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class Calculate 
{
    public double result;
    
    public double Add (double value1, double value2){
        result = value1 + value2;
        return result;
    }

    public double Substract (double value1, double value2)
    {
        result = value1 - value2;
        return result;
    }

    public double Division (double value1, double value2)
    {
        result = value1 / value2;
        return result;
    }

    public double Multiplicate (double value1, double value2)
    {
        result = value1 * value2;
        return result;
    }
}
