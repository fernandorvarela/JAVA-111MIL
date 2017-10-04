/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class GuiaWhile {
    public static void MostrarPares(){

        Integer contador=0;
        
        while(contador<100)
        {
        contador++;
            if (contador%2==1) {
                System.out.println("es par: "+contador);
            }
        }
        
        
}
    public static void SacarCantidadDeMayores(){
    
        /*
        Pedir 5 edades e informar cuantos mayores a 18 hay.
        */
        Integer contador=0;
        String aux;
        Integer edad;
        Integer CantidadDeMayores=0;
        
        Scanner miTeclado= new Scanner(System.in);
        
        
        while (contador<5){
            contador ++;
            System.out.println("Ingrese edad ");
            aux= miTeclado.next();
            edad= Integer.parseInt(aux);
            if (edad>17) {
                CantidadDeMayores++;
            }
            System.out.println("Hay"+CantidadDeMayores+"mayores");
            
            /*
            *sacar cantidad de positivos
            *sacar cantidad de pares
            *(pido nombre) sacar cantidad de marias
            */
        }
        
        
        
    }
    public static void cuentaregresiva(){
        
        
    Integer contador=10;
    Integer sumador=0;
    Integer cantidad;
    Integer promedio=0;
    cantidad=10;
    
    while(contador<cantidad){
        contador++;
        System.out.println("numero: "+contador);
        
        sumador= sumador+contador;
    }
        promedio=sumador/cantidad;
    
    }
    
    public static void SaludarWhile(){
    
        System.out.println("Saludar");
    
        
        Scanner miTeclado= new Scanner(System.in);
    String respuesta;
    Integer contador=0;
    
    
    System.out.println("hay alguien para la edad");
    respuesta= miTeclado.next();
    
    while(respuesta.equals("si")){
        //tomo los datos
        
        contador++;
        
        System.out.println("Hay alguien mas para la edad?");
        respuesta= miTeclado.next();
    }
        
    }
    
    
}
