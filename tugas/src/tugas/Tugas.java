/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Kanzu
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input=new Scanner(System.in);
        
        int pilihan, awal, akhir;
        
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GENAP");
        System.out.println("--------------------------------------------");
        System.out.println("Masukkan Pilihan [2. Genap] : ");
        pilihan=input.nextInt ();
        System.out.println("Masukkan Nilai Awal : ");
        awal=input.nextInt();
        System.out.println("Masukkan Nilai Akhir : ");
        akhir=input.nextInt();
        System.out.println("----------------------------");
        
        switch (pilihan ) {
            
            case 1 :
                System.out.println("Deret Bilangan Genap");
                for(int i=awal;i<akhir;i++) {
                    if (i%2==0)
                        System.out.print(i+" ");
                }
                break;
        }
        System.out.println("");
    }
    
}
