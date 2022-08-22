/*
 Crie uma classe ArCondicionado, no ar condicionado deve ter as características (atributos)
temperatura, e sala (localização) deixe estes atributos em privado, atribua os métodos getters
e setters, obedeça à seguinte regra:
a) O usuário só consegue setar a temperatura entre 18 e 30 graus.
Crie no mínimo 3 ares-condicionados, seta a temperatura dos 3 e coloque uma localização em
cada um, após imprima a temperatura de cada ar-condicionado com a sua localização.
 */
package exercices.Constructor_Method_Exercices.AulaEncopsulamento.aulaencopsulamento;

/**
 *
 * @author 20201sg.inf_i0035
 */
public class ArCondicionado {
    private int temperatura;
    private String local;

    public void setTemperatura (int temperatura){
        if (temperatura >= 18 && temperatura <= 30){
            this.temperatura = temperatura;
        }
    }
    public int getTemperatura (){
        return temperatura;
    }
        public void setLocal (String local){
            this.local = local;
    }
        public String getLocal(){
            return local;
        }
        
}
