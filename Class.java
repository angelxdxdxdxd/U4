/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

/**
 *
 * @author Usuario
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] numeros = new int [4][];
        numeros[0] = new int [1];
        numeros [1] = new int [2];
        numeros [2] = new int [3];
        numeros [3] = new int [4];
        
        int k=1;
        
        //System.out.println(numeros);
        System.out.println(numeros.length);
        
        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i].length);
            
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]=k;
                k++;
            }
    }
    for (int i=0; i < numeros.length; i++) {
        for (int j = 0; j < numeros[i].length; j++) {
            System.out.print(numeros[i][j] + "");
        }
        System.out.println();
    }
}
}
