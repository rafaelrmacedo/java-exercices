package exercices.exercice_004.exercice_003;

public class Poo {

    public static void main(String[] args) {
        pen p1 = new pen();
        
        p1.comprimento = 1;
        p1.cor = "purple";
        p1.tamanhoPonta = 10;
        p1.dono = "Xavier";
        p1.quebrado = false;
        
        p1.quebrar();
        p1.escrever();
    }
    
}
