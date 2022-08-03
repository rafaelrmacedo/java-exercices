/*
1 - Implemente as classes abaixo, obedecendo às seguintes regras:
a) Atribua método construtor a todas as classes. feito
b) Atribua métodos gets pata todos os atributos. feito
c) Atribua métodos sets para os atributos nome, comprimento, cor, velocidade e
alimento.
d) Um peixe sempre deve ter 0 patas
e) O ambiente do mamífero é a Terra
f) Urso e Gato devem ter 4 Patas
g) Animal e Mamífero não podem ser instanciadas (não pode ser possível criar objetos
dessas classes)

Construa no programa principal no mínimo um peixe, um Urso e um gato, depois imprima as
características deles.
 */
package exercicioanimais;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class Main {

    public static void main(String[] args) {
     
        Fish fish = new Fish(2, 1, "Puffer Fish", "Yellow", 20, 0, "Sea", 6);
        
       //System.out.println(fish.showData());
        fish.showData();
        
 
    }
    
}
