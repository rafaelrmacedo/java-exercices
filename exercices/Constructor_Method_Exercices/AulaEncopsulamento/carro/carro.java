/* Crie uma Classe carro, carro deve possuir:
a) Modelo (String), ano Fabricação (int), Dono (String), distância percorrida (float), tempo
rodado em horas(float)
b) Crie um método construtor que receba as características da letra a
c) Para cada variável crie métodos get e set.
d) Este carro deve possui um método chamado getVelocidadeMédia, este método deve
calcular e retornar qual a velocidade média que o carro andou. */
package exercices.Constructor_Method_Exercices.AulaEncopsulamento.carro;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class carro {
    private String modelo;
    private int anoFab;
    private String dono;
    private float distancia;
    private float tempoRodado; //Em horas
    private float velocidadeMedia;
    
    //metodo construtor abaixo
    public carro (String modelo, int anoFab, String dono, float distancia, float tempoRodado){
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.dono = dono;
        this.distancia = distancia;
        this.tempoRodado = tempoRodado;
    }
            
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAno (int anoFab){
        this.anoFab = anoFab;
    }
    public int getanoFab(){
        return anoFab;
    }
    public void setDono (String dono){
        this.dono = dono;
    }
    public String getDono(){
        return dono;
    }                                               
    public void setDistancia (float distancia){       //d
        this.distancia = distancia;                 //v   t
    }
    public float geDistancia(){
        return distancia;
    }
    public void setTempo (float tempo){
        //this.tempoRodado = tempoRodado;
    }
    public float getTempo(){
        return tempoRodado;
    }   
    public float getVelocidadeMedia(){
        velocidadeMedia = distancia / tempoRodado;
        return velocidadeMedia; 
    }
    
}
