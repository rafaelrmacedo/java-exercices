/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioanimais;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class Mammal extends Animal{
    private String food;

    public Mammal(String name, String color, float height, int pawNumber, String environment, float velocity) {
        super(name, color, height, pawNumber, environment, velocity);
    }
    
    public void setFood (String food){
        this.food = food;
    }
}
