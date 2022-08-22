/*
Crie uma classe Produto, produto vai ter descrição e preço, coloque estes dois atributos em
privado, obedeça à seguinte regra:
a) O preço deve ser maior que zero.
Crie no mínimo 3 Produtos, coloque descrição e valor em cada um. Após imprima os 3.
*/
package exercices.Constructor_Method_Exercices.AulaEncopsulamento.produto;

/*
 *
 * @author 20201sg.inf_i0035
 */
public class produto {
    private String descricao;
    private float preco;
    
    public void setPreco (float preco){
        if (preco > 0){
            this.preco = preco;
        }
    }
    public float getPreco(){
        return preco;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
