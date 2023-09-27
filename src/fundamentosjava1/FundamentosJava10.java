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
        
        System.out.println("CONDICIONALES");
        
        int edad = 38;
        
        if (edad >= 38) {
            System.out.println("No está en el rango de edad");
        } else if (edad >= 18) {
            System.out.println("Es mayor de 18");
        } else {
            System.out.println("No es mayor");
        }
    }
}