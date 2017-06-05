/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author alvar
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Consumo coche1 = new Consumo();
        coche1.velocidades();
        coche1.setLitros(50);
        coche1.velocidades();
        coche1.setPGas(1.57f);
        coche1.velocidades();
        Consumo coche2 = new Consumo(500,43,98.2f,1.57f);
        coche2.velocidades();
        System.out.println(coche2.consumoMedio()+" litros cada 100 Km");
        coche2.setLitros(90);
        System.out.println(coche2.getVMed()+" Km/h");
        coche2.velocidades();
    }
    
}
