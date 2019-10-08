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
public class Operacja {
    private static double liczbaPier;

    public static double getLiczbaPier() {
        return liczbaPier;
    }
    
    private double liczbaOperacyjna;
    Operacja(double liczbaPier,double liczbaOperacyjna){
    this.liczbaOperacyjna=liczbaOperacyjna;
    this.liczbaPier= liczbaPier;
    }
    public void dodaj(){
        liczbaPier+=liczbaOperacyjna;
        try{
           Thread.sleep(1000);
            
         }catch(InterruptedException e){
         System.out.print("Przerwany Wątelk");
     }
     
    }
    public void odejmij(){
        
     liczbaPier-=liczbaOperacyjna;
     try{
           Thread.sleep(1000);
            
         }catch(InterruptedException e){
         System.out.print("Przerwany Wątelk");
     
    }
    }
    public void pomnusz(){
        
    liczbaPier*=liczbaOperacyjna;
    
     try{
           Thread.sleep(1000);
            
         }catch(InterruptedException e){
         System.out.print("Przerwany Wątelk");
     
    }
    }
    public void podziel(){
        
        liczbaPier/=liczbaOperacyjna;
    
     try{
           Thread.sleep(1000);
            
         }catch(InterruptedException e){
         System.out.print("Przerwany Wątelk");
     
    }
    }
    public double getWynik(){
     return  liczbaPier; 
    }
}
