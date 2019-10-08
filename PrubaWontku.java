/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prubawontku;

/**
 *
 * @author LENOVO
 */
public class PrubaWontku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacja ope =new Operacja(16,2);
        Operator p1 = new Operator(ope,1);
        Operator p2 = new Operator(ope,2);
        Operator p3 = new Operator(ope,3);
        Operator p4 = new Operator(ope,4);
        try{
            p1.t.join();
            p2.t.join();
            p3.t.join();
            p4.t.join();
        }catch(InterruptedException e){
            
    }
        System.out.print("   Wynik działania wynosi "+ ope.getWynik());
        }
    
}
