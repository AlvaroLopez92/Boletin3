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
public class Consumo {

    private float km,litros,vMed,pGas;

    public Consumo(){
        km=0;
        litros=0;
        vMed=0;
        pGas=0;
        
    }

    public Consumo(float a, float b, float c,float d){
        km=a;
        litros=b;
        vMed=c;
        pGas=d;
    }

    public String getTempo(){

        int h, m, s;
        h = (int) (km/vMed);
        m = (int) (((km/vMed)-h)*60);
        s = (int) (((((km/vMed)-h)*60)-m)*60);
        System.out.println((km/vMed)+"  "+(((km/vMed)-h)*60));
        return h+"h "+m+"m "+s+"s";
    }
    
    public float consumoMedio(){
        return litros/(km/100);
    }
    
    public float consumoEuros(){
        return litros*pGas;
    }
    
    public void setKm(float kms){
        km=kms;
    }
    
    public void setLitros(float lit){
        litros=lit;
    }
    
    public void setVMed(float vmed){
        vMed=vmed;
    }
    
    public void setPGas(float pgas){
        pGas=pgas;
    }
    
    public float getKM(){
        return km;
    }
    
    public float getLitros(){
        return litros;
    }
    
    public float getVMed(){
        return vMed;
    }
    
    public float getPGas(){
        return pGas;
    }
    
    public void velocidades(){
        System.out.println("Km= "+km+" litros= "+litros+" Velocidad media= "
                +vMed+" Precio gasolina= "+pGas);
    }
    
}
