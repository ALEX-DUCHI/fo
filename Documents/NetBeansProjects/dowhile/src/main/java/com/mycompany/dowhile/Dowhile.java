/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhile;
import java.util.Scanner; // aqui van las librerias
 

/**
 *
 * @author User
 */
public class Dowhile {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int num;
        
        do{
        System.out.println("adivina un numero del 1 al 10");
        num =input.nextInt(); // nosotros le damos el valor
        } while(num !=5); 
        
        System.out.println("correcto");
        input.close();
    }
}
