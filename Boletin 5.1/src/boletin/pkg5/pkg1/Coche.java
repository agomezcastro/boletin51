

package boletin.pkg5.pkg1;

/**
 *
 * @author agomezcastro
 */
public class Coche {
    private int velocidade;
   
//constructores
    public Coche(){
}
    public Coche(int vel ){
        velocidade= vel;
      
                
}
    //metodos de acceso
    public void setVelocidade(int vel ){
        velocidade= vel;
        
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    public int acelerar(int valor){
        velocidade= velocidade+valor;
        return velocidade;
    }
    
    public int frenar(int menos){
        velocidade= velocidade-menos;
        return velocidade;
    }
}
