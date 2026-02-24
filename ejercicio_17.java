/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mypoo2.ejercicios_poo;

import java.util.Scanner;

/**
 *
 * @author HP-255-G10
 */
public class ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
        float radio, area, longitud;
        final float pi=3.1416f;
        System.out.println("Esbriba el radio de un circulo: ");
        radio= entrada.nextFloat();
        area= pi * (radio* radio);
        longitud= 2 * (pi * radio);
        System.out.println("El area del circulo es: "+area);        
        System.out.println("La longitud del circulo es: "+longitud);        

        
        
    }
    
}
