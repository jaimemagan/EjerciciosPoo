package Factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
     protected String nombre;
     protected String masa;
     protected String salsa;
     protected List<String> ingredientes;

     public PizzaProducto(){
         this.ingredientes = new ArrayList<>();
     }


//metodo
     public void preparar(){
         System.out.println("preparando =" + nombre);
         System.out.println("Masa =" + masa);
         System.out.println("Salsa =" + salsa);

         System.out.println("Ingredientes = ");
         for(String ingrediente : ingredientes){
             System.out.println(" -" + ingrediente);
         }
     }
 //metodo
     public void cocinar(){


     }



}
