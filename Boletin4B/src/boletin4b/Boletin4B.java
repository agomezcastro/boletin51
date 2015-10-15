

package boletin4b;

import java.util.Scanner;

/**
 *
 * @author agomezcastro
 */
public class Boletin4B {

   
    public static void main(String[] args) {
        
        float km, litros, vMed, pGas;
        Scanner obx = new Scanner(System.in);
        System.out.println("introduce km: ");
        km= obx.nextFloat();
        System.out.println("introduce litros: ");
        litros= obx.nextFloat();
        System.out.println("introduce vMed: ");
        vMed= obx.nextFloat();
        System.out.println("introduce pGas: ");
        pGas= obx.nextFloat();
        Consumo consumo = new Consumo(km, litros, vMed, pGas);
        System.out.println("tempo: "+ consumo.getTempo()+ "horas");
        System.out.println("consumo medio: "+ consumo.consumoMedio()+ "L/100km");
        System.out.println("consumo en euros: "+ consumo.consumoEuros()+ "€/100km");
    }
    
}
