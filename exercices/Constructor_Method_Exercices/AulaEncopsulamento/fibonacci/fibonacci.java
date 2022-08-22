/*
Crie uma classe chamado SerieFibonacci, está classe deve possuir:
a) Um atributo (variável) privadon
b) Um método construtor que recebe n
c) Métodos get e set para n
d) Um método mostrarSérie, este método deve mostrar a série com n algarismos
Faça com que o usuário digite o valor de n
 */
package exercices.Constructor_Method_Exercices.AulaEncopsulamento.fibonacci;


public class fibonacci {
    private int n;
    //private float mostrarSerie;

    public fibonacci(int n){
        this.n = n;
    }

    public void setNumero (int n){
        this.n = n;
    }
    public int getNumero(){
        return n;
    }



}
