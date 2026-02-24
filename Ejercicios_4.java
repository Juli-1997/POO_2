/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mypoo2.ejercicios_poo;

import java.util.Scanner;

/**
 *
 * @author HP-255-G10-Juliana-Castellar
 */
public class Ejercicios_4 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad_juan, edad_Alb, edad_ana, edad_mama;
        System.out.println("Juan, Cuantos años tienes?");
        edad_juan= entrada.nextInt();
        edad_Alb= ((edad_juan * 2) / 3);
        edad_ana= ((edad_juan * 4)/ 3);
        edad_mama= (edad_juan + edad_Alb + edad_ana);
        System.out.println("La edad de Juan es :"+edad_juan);
        System.out.println("La edad de Alberto es :"+edad_Alb);
        System.out.println("La edad de Ana es :"+edad_ana);
        System.out.println("La edad de la Mama es :"+edad_mama);
    }
}
