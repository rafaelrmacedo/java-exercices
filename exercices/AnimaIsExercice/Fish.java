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
public class Fish extends Animal {
    
    //fin = barbatana
    
    int fin;
    int tail; 

    public Fish(int fin, int tail, String name, String color, float height, int pawNumber, String environment, float velocity) {
        super(name, color, height, pawNumber, environment, velocity);
        this.fin = fin;
        this.tail = tail;
    }
    public void showData(){
        
        //usar getVariavel pois como ela está privado e em outra classe, devo usar o método
        
        System.out.printf("Fin: %d", fin);
        System.out.println("");
        System.out.printf("Tail: %d", tail);
        System.out.println("");
        System.out.printf("Name: %s", getName());
        System.out.println("");
        System.out.printf("Color: %s", getColor());
        System.out.println("");
        System.out.printf("Height: %f", getHeight());
        System.out.println("");
        System.out.printf("Paw Number: %d", getPawNumber());
        System.out.println("");
        System.out.printf("Environment: %s", getEnvironment());
        System.out.println("");
        System.out.printf("Velocity: %f", getVelocity());
        
    }
    
}
