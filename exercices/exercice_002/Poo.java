package exercices.exercice_002;

/**
 *
 * @author 20201SG.INF_I0035
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pen p1 = new pen();
        
        p1.comprimento = 10;
        p1.cor = "purple";
        p1.tamanhoPonta = 1;
      
        p1.apontar();
        p1.status();
        p1.escrever();
    }
    
}
