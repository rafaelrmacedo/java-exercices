package exercices.immobile;

public class UsageImmobile extends Immobile{

    int discount;
    
    public UsageImmobile (String color, int builtArea, int value, int discount) {
        super(color, builtArea, value);
        this.discount = discount;
    }

}
