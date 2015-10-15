

package boletin4b;

/**
 *
 * @author agomezcastro
 */
public class Consumo {
    private float kilometros;
    private float litroscombustible;
    private float velocidadmedia;
    private float preciogas;
    //constructores
    public Consumo(){
        
    }
    public Consumo(float km, float litros, float vMed, float pGas){
        kilometros= km;
        litroscombustible= litros;
        velocidadmedia= vMed;
        preciogas= pGas;
    }
    //metodos de acceso
    public float getTempo(){
        return kilometros/velocidadmedia;
    }    
    public float consumoMedio(){
        return litroscombustible*100/kilometros;
    }
    public float consumoEuros(){
        return preciogas*100/kilometros;
    }
    public void setKms(float km){
        kilometros= km;
    }
    public void setLitros(float litros){
        litroscombustible= litros;
    }
    public void setvMed (float vMed){
        velocidadmedia= vMed;
    }
    public void setPGas (float pGas){
        preciogas= pGas;
    }
    
}
