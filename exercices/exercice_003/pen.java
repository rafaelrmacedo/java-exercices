package exercices.exercice_003;

public class pen {
    float tamanhoPonta;
    String cor;
    int comprimento;
    String dono;
    
    public void apontar(){
        comprimento--;
       if (comprimento == 0){
            System.out.printf("O lápis %s do(a) %s chegou ao fim", cor, dono);
       } else {
            System.out.printf("O lápis %s está sendo apontado", cor);
            System.out.println("\n");
            System.out.printf("tamanho da ponta anterior: %f", comprimento+1);
            System.out.println("\n");
            System.out.printf("tamanho da ponta atual: %f", comprimento);
       }
        
    }
    public void status(){
        System.out.print("\n");
        System.out.printf("O lápis está com o comprimento de %d, e o tamanho da ponta é %f", comprimento, tamanhoPonta);
    }
    public void escrever(){
        System.out.print("\n");
        System.out.printf("O lápis está escrevendo", cor);
    }
}
