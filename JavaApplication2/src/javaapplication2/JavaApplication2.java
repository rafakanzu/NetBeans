/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Kanzu
 */
public class JavaApplication2 {

    /**
     * @param hady
     */
   public static void main (String [] hady){


        final double n_matematika , n_kimia , n_fisika , n_biologi , n_akhir;

        Scanner input = new Scanner (System.in);
        String hasil;

  System.out.println("===== Menghitung Nilai Siswa=====\n");

        System.out.print("Nilai matematika : ");

        n_matematika = input.nextInt();

        System.out.print("Nilai kimia : ");

        n_kimia = input.nextInt();

        System.out.print("Nilai fisika : ");

        n_fisika = input.nextInt();

        System.out.print("Nilai biologi : ");

        n_biologi = input.nextInt();

        n_akhir = (0.15 * n_matematika + 0.20 * n_kimia + 0.30 * n_fisika + 0.35 * n_biologi);

        System.out.println(n_akhir);
        
        if((n_akhir >=75) && (n_akhir <=100)){
           System.out.println("Selamat Anda Lulus");
           
        }
        else {
            System.out.println("Maaf Anda Tidak Lulus");
            
                    }
            
        }
    }
    

