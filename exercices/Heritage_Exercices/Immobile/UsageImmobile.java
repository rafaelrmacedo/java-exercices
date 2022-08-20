package exercices.Heritage_Exercices.Immobile;

public class UsageImmobile extends Immobile{

    int discount;
    
    public UsageImmobile (String color, int builtArea, int value, int discount) {
        super(color, builtArea, value);
        this.discount = discount;
    }

    public void calculateValueOfSale(int value){

        value = value - discount;

        System.out.println(value);

    }

}
