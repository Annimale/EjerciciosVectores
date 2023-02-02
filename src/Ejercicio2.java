/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Escribe un programa que permita introducir un vector de diez
elementos alfanuméricos y luego visualizar los que ocupen la posición
par.
Repetir para los de posición impar
 * @author skril
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        
        String [] alfanum={"a","b","c","d","e","f","g","h","i","j"};
       
        
        System.out.println("Imprimimos los alfanumericos que ocupan una posicion par en el vector");
        for (int i = 0; i < alfanum.length; i+=2) {
            System.out.println(alfanum[i]);
            
        }
        System.out.println("Imprimimos los alfanumericos que ocupan una posicion impar en el vector");
        for (int i = 1; i < alfanum.length; i+=2) {
            System.out.println(alfanum[i]);
           
        }
    }
    
}
