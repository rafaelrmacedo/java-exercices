/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.Heritage_Exercices.AnimaIs;

public class Cat extends Mammal{

    public Cat(String name, String color, float height, int pawNumber, String environment, float velocity, String food) {
        super(name, color, height, pawNumber, environment, velocity);
    }

    public void showData(){
        
        //usar getVariavel pois como ela está privado e em outra classe, devo usar o método
        
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Color: %s\n", getColor());
        System.out.printf("Height: %.0f cm \n", getHeight());
        System.out.printf("Paw Number: %d\n", getPawNumber());
        System.out.printf("Environment: %s\n", getEnvironment());
        System.out.printf("Velocity: %.0f m/s\n", getVelocity());
        System.out.println("");
        
    }
    
}
