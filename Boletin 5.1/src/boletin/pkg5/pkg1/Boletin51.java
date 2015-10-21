

package boletin.pkg5.pkg1;

import java.util.Scanner;

/**
 *
 * @author agomezcastro
 */
public class Boletin51 {


    public static void main(String[] args) {
        int velocidade, aceleracion, freno;
        Scanner obx = new Scanner (System.in);
        System.out.println("introduce velocidade :");
        velocidade= obx.nextInt();
        System.out.println("introduce aceleracion :");
        aceleracion= obx.nextInt();
        System.out.println("introduce freno :");
        freno= obx.nextInt();
        Coche coche1 = new Coche ();
        System.out.println("velocidade actual :"+ coche1.getVelocidade());
        System.out.println("velocidade acelerando: "+ coche1.acelerar(5));
        System.out.println("velocidade frenando :"+ coche1.frenar(2));
        
        
    }
    
}
