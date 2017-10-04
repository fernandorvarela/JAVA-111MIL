/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Iteraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        diferencia entre if and while
        
        Integer edad=18;
        
        
        while(edad <17)
        {
            System.out.println("hola menor");
        }
        
        while(edad >17)
        {
            System.out.println("hola mayor");
        }*/
        
        
        /*Integer contador=0;
        String aux;
        Integer edad;
        Integer sumador=0;
        Integer promedio;
        
        Scanner miTeclado= new Scanner(System.in);
        while(contador <3){
            
            System.out.println("Ingrese su edad persona numero:   "+contador);
            aux= miTeclado.next();
            edad= Integer.parseInt(aux);
            sumador= sumador+edad;
            contador= contador+1;
        }
        promedio= sumador/3;
        System.out.println("el promedio es: "+promedio);*/
        
        GuiaWhile.MostrarPares();
        
    }
    
}
