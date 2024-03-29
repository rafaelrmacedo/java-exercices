/* 2 – Crie 3 Classes, Imóvel, Imóvel usado e Imóvel novo
Imóvel:
Atributos: cor, área construída e valor
Imóvel usado:
Atributos: cor, área construída, valor, valor desconto
Imóvel novo:
Atributos: cor, área construída, valor, valor adicional
Tanto Imóvel, Imóvel usado e Imóvel novo possuem um método chamado calcularValorVenda,
com a diferença que:
calcularValorVenda de Imóvel retorna o valor;
calcularValorVenda de Imóvel novo retorna o valor incrementado do valor adicional;
calcularValorVenda de Imóvel usado retorna o valor descontado do valor desconto;
Crie métodos getters e setter para todos os aributos, obedecendo a seguinte regra:

Caso modifique a área construída o valor do imóvel deve mudar proporcionalmente, exemplo:
A casa tinha 100 metros quadrados, aumentou para 110 metros, a área aumentou 10%, então
o valor também deve aumentar em 10%.
Crie no programa principal 1 casa de cada tipo. */
package exercices.Heritage_Exercices.Immobile;
public class Main {
    public static void main(String[] args) {
        
        Immobile immobile = new Immobile("grey", 180, 300000);
        UsageImmobile usageImmobile = new UsageImmobile("green", 160, 200000, 50000);
        NewImmobile newImmobile = new NewImmobile("white", 200, 380000, 20000);

        immobile.calculateValueOfSale(300000);
        usageImmobile.calculateValueOfSale(200000);
        newImmobile.calculateValueOfSale(380000);
    }
}
