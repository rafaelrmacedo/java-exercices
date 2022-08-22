/* 2 – Crie 3 Classes, Imóvel, Imóvel usado e Imóvel novo
Imóvel:
Atributos: cor, área construída e valor. feito
Imóvel usado:
Atributos: cor, área construída, valor, valor desconto. feito
Imóvel novo:
Atributos: cor, área construída, valor, valor adicional. feito
Tanto Imóvel, Imóvel usado e Imóvel novo possuem um método chamado calcularValorVenda,
com a diferença que:
calcularValorVenda de Imóvel retorna o valor;
calcularValorVenda de Imóvel novo retorna o valor incrementado do valor adicional;
calcularValorVenda de Imóvel usado retorna o valor descontado do valor desconto;

Crie métodos getters e setter para todos os atributos, obedecendo a seguinte regra:
    Caso modifique a área construída o valor do imóvel deve mudar proporcionalmente, exemplo:
    A casa tinha 100 metros quadrados, aumentou para 110 metros, a área aumentou 10%, então
    o valor também deve aumentar em 10%.

Crie no programa principal 1 casa de cada tipo. */

package exercices.Relation_Exercises.Immobile_Exercise;

public class Immobile {

    private String color;
    private int builtArea;
    private int value;

    public Immobile(String color, int builtArea, int value) {
        this.color = color;
        this.builtArea = builtArea;
        this.value = value;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getBuiltArea() {
        return builtArea;
    }
    public void setBuiltArea(int builtArea) {
        this.builtArea = builtArea;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void calculateValueOfSale(int value){

        System.out.println(value);

    }
    

}
