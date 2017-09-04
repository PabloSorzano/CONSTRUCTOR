/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Pablo Sorzano
 */
public class verNetflix {
    boolean flojera=false;
    verNetflix(){
        System.out.print("No");
    }
    verNetflix(boolean flojera){
        this.flojera=flojera;
        System.out.print("Si");
    }
    
    /**
     *
     */
    public void mostrar(){
        if(flojera==true){
            System.out.println(" se puede por que:");
            System.out.println("Estoy comodo y");
            System.out.println("con la flojera = "+flojera);
            System.out.println("\n");
        }else if(flojera==false){
            System.out.println(" se puede por que:");
            System.out.println("Estoy incomodo y");
            System.out.println("con la flojera = "+flojera);
            System.out.println("\n");
        }
    }
}
