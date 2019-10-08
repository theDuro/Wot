/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prubawontku;


public class Operator implements Runnable {
int działanie;
  Thread t;
 private Operacja o;
 public Operator(Operacja o,int działanie){
 this.działanie= działanie;
 this.o =o;
 t = new Thread(this);
 t.start();
 }

    @Override
    
     public void run() {
        
        switch(działanie){
            case 1:
             o.dodaj();
             System.out.print(" dodawanie \n");
             break;
            case 2:
             o.odejmij();
              System.out.print(" odejmowanie \n");
             break;
            case 3:
             o.pomnusz();
              System.out.print(" mnozenie \n");
             break;
            case 4:
             o.podziel();
              System.out.print(" dzielenie \n");
                break;
            default:
             System.out.print(" Coś poszło nie tak "+o.getWynik());
        
            
        }
         
    try{
           Thread.sleep(1000);
            
         }catch(InterruptedException e){
         System.out.print("Przerwany Wątelk");
     }
        
    }
}
    

