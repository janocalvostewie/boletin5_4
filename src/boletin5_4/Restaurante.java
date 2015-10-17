
package boletin5_4;
/**
 *
 * @author Jano
 */
public class Restaurante {
    //ATRIBUTOS
    private float pulpo;
    private float patatas;
    
    //CONSTRUCTORES
    public Restaurante(){
    }
    public Restaurante(float pu, float pa){
        pulpo=pu;
        patatas=pa;
    }
    //GETTERS
    public float getPulpo(){
        return pulpo;
    }
    public float getPatatas(){
        return patatas;
    }
    
    //SETTERS
    public void setPulpo(float pu){
        pulpo=pulpo+pu;
    }
    public void setPatatas(float pa){
        patatas=patatas+pa;
    }
    
    //MÉTODOS
    public float calcularClientes(){
        float cliPulpo= (3*pulpo)/2;
        float cliPatatas=3*patatas;
        float numero;
        return numero=(cliPulpo>cliPatatas)?cliPatatas:cliPulpo;
    }
}
