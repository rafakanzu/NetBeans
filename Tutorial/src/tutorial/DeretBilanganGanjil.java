/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;
import java.util.Scanner;
/**
 *
 * @author Kanzu
 */
public class DeretBilanganGanjil {
    public static void main(String[] args){
                        int a;
                        Scanner keyboard = new Scanner (System.in);
                        
                        
                        System.out.print("Masukkan Angka Maksimal: ");
                        a=keyboard.nextInt();
                        
                        
                        for(int i= 1; i <=a; i += 2){
                            System.out.print( i + " ");
                            
                        }
    }
    
}
