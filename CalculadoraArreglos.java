/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4.declaracionnew;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class CalculadoraArreglos {
    public static void main(String[] args) {
        double [] ops = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
            
       
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("1. Suma");
            System.out.println("2. Multiplicacion");
        
        opcion = scanner.nextInt();
            
        switch (opcion) {
            case 1: 
                double suma = 0;
                for ( double elemento : ops) {
                    suma += elemento;
                }
                System.out.println("La suma de los elementos: " + suma);
                System.out.println("");
                break;
            case 2:        
                double mult = 1;
                for ( double elemento : ops) {
                    mult *= elemento;
                }
                System.out.println("La multiplicacion de los elementos: " + mult);
                System.out.println("");
                break;
            default:
                System.out.println("Aqui no hijo :/");
                System.out.println("Elija una opcion valida");
        }
        } while (opcion !=3);
    }
}    


