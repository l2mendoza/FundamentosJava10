/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava1;

/**
 *
 * @author Gamal
 */
public class FundamentosJava10 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
     /* System.out.println("CONDICIONALES");
        
        int edad = 38;
        
        if (edad >= 38) {
            System.out.println("No está en el rango de edad");
        } else if (edad >= 18) {
            System.out.println("Es mayor de 18");
        } else {
            System.out.println("No es mayor");
        }
        System.out.println("BUCLE FOR ");
        
        //EL BUCLE FOR SE UTILIZA CUANDO SABEMOS DE ANTEMANO CUANTAS VECES
        //QUEREMOS QUE SE EJECUTE EL CODIGO
        /*
        for  (inicializacion; condicion;actualizacion) {
            bloque de codigo
        }
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("numero : "+i);
         
 // ESTUDIAR ESTRUCTURA DE ARREGLO EN JAVA Y COMO ACCEDER A SUS POSICIONES
           System.out.println("---------") ; 
            int [] numeros = {1,2,3,4,5 };
           for (int j = 0 ;j < numeros.length; j++) {
               System.out.println("Elemento" + j + " : "+numeros [j]);
               
        }
 
            //EL BUCLE WHILE SE UTILIZA CUANDO SABEMOS CUANTAS VEDCES DEBE EJEJCUTARRSE EL COGIGO,DEPENDE DE  
            //UNA CONDICION PARA DETENERSE
            System.out.println("BUCLE WHILE");
            int contador =1;
            while (contador < numeros.length )  {
                System.out.println("numero : " + contador) ;
                contador++;
            }
            
     }
        
        

 
 
 
 
 
 }
 
 
 
 
 
}