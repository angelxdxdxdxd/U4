/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class ArregloBi {
    
    public static void main(String[] args) {
        String[][] letras = {
            {"a", "b", "c", "d", "e"},
            {"f", "g", "h", "i", "j"},
            {"k", "l", "m", "n", "o"}
            
        };  
        
        for (int i = 0; i < letras.length; i++){
            for (int o = 0; o < letras[i].length; o++){
                System.out.print(letras[i][o] + ", ");
            }
        System.out.println();
        }
    }
}
