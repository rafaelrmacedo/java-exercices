/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.Constructor_Method_Exercices.AulaEncopsulamento.xicara;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class Xicara {
    private  String material;
    private String cor;
    private float volume;
    
    // o metodo abaixo ele força a atribuir um metodo no main program
    public Xicara(String material, String cor){
        this.material = material;
        this.cor = cor;
    }
    
    public void setMaterial(String material){
        this.material = material;
        /* O material da function vai receber o material da xicara*/
    }
    public String getMaterial (){
        return this.material;
    }
    public void setCor(String cor){
        this.cor = cor;
        /* O material da function vai receber o material da xicara*/
    }
    public String getCor (){
        return this.cor;
    }
    public void setMaterial(float volume){
        this.volume = volume;
        /* O material da function vai receber o material da xicara*/
    }
    public float getVolume (){
        return this.volume;
    }
    public void status(){
        
    }
}
