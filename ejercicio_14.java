/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mypoo2.ejercicios_poo;

import java.util.Scanner;

/**
 *
 * @author HP-255-G10-Juliana-Castellar
 */
public class ejercicio_14 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num, cuadrado, cubo;
        System.out.println("Esbriba un numero: ");
        num= entrada.nextInt();
        cuadrado= num * num;
        cubo= num * num * num;
        System.out.println("El cuadrado del numero es: "+cuadrado);
        System.out.println("El cubo del numero es: "+cubo);

        
    }
    
}

