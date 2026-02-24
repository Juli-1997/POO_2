/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mypoo2.ejercicios_poo;

/**
 *
 * @author HP-255-G10
 */
public class ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int horas_semana, valor_hora, salario_bruto, retencion, salario_neto;
       float por_retencion;
       horas_semana= 48;
       valor_hora= 5000;
       por_retencion= (float)(12.5/100);
       salario_bruto= horas_semana * valor_hora;
       retencion= (int) (salario_bruto * por_retencion);
       salario_neto= salario_bruto - retencion;
       
       System.out.println("El salario bruto es: "+ salario_bruto);
       System.out.println("La retencion de la fuente es: "+ retencion);
       System.out.println("El salario neto es: "+ salario_neto);

    }
    
}
