package exercices.immobile;

public class NewImmobile extends Immobile{
    
    int addionalValue;

    public NewImmobile (String color, int builtArea, int value, int addionalValue) {
        super(color, builtArea, value);
        this.addionalValue = addionalValue;
    }

    public void calculateValueOfSale(int value){

        value = value + addionalValue;

        System.out.println(value);

    }
    
}
