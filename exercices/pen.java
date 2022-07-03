package exercices;

public class pen {
    float tamanhoPonta;
    String cor;
    int comprimento;
    
    public void apontar(){
       comprimento--;
        System.out.printf("O lápis %s está sendo apontado: "
                + "Comprimento anterior: %d"
                + "Comprimento atual: %d", cor, comprimento+1 , comprimento);
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
