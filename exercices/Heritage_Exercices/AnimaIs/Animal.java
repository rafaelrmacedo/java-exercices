/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.Heritage_Exercices.AnimaIs;

public abstract class Animal {
    private String name;
    private float height;
    private int pawNumber;
    private String environment;
    private String color;
    private float velocity;

    public Animal(String name, String color, float height, int pawNumber, String environment, float velocity) {
        this.name = name;
        this.height = height;
        this.pawNumber = pawNumber;
        this.environment = environment;
        this.color = color;
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public int getPawNumber() {
        return pawNumber;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getColor() {
        return color;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }
    public void setHeight (int height){
        this.height = height;
    }
}
