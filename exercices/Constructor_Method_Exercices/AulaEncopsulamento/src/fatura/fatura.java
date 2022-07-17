/*
Crie um classe chamada fatura, fatura de ter:
a) Descrição (String), quantidade comprada de um item (int), preço por item (double),
todos privados.
b) Método construtor e métodos get e set para cada variável. Se a quantidade e o preço
não forem positivos, eles devem ser configurados como Zero.
c) Método getFaturaTotal, este método deve calcular o valor da fatura e retornar o valor
da fatura total como um double
Faça com que o usuário possa digitar a Descrição, quantidade comprada de um item e o
preço por item
 */
package exercices.Constructor_Method_Exercices.AulaEncopsulamento.src.fatura;
import java.util.Scanner;

public class fatura {
    private String descricao;
    private int quant;
    private double preco;
    double faturaTotal;
    
    public fatura (String descricao, int quant, double preco){
        this.descricao = descricao;
        this.quant = quant;
        this.preco = preco;
    }
            
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setQaunt (int quant){
        if (quant < 0){
            quant = 0;
        }
        this.quant = quant;
    }
    
    public int getquant(){
        return quant;
    }
    
    public void setpreco (double preco){
        if (preco < 0 ){
            preco = 0;
        }
        this.preco = preco;
    }
    
    public double getpreco(){
        return preco;
    }       
    
    public double getFaturaTotal(){
        faturaTotal = quant * preco;
        return faturaTotal;
    }
}
