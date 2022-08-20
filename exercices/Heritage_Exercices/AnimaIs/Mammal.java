/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.AnimaIsExercice;

public abstract class Mammal extends Animal{
    String food;

    public Mammal(String name, String color, float height, int pawNumber, String environment, float velocity) {
        super(name, color, height, pawNumber, environment, velocity);
    }
    
    public void setFood (String food){
        this.food = food;
    }
}
