/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangangenapp;
import java.util.Scanner;
/**
 *
 * @author Kanzu
 */
public class Bilangangenapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input=new Scanner(System.in);

        int pilihan, awal, akhir;
    
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN HANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Pilihan [1. Ganjil] | [2. Genap] : ");
        pilihan=input.nextInt();
        System.out.print("Masukan Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------- ");

        switch (pilihan){
            case 1 :  
                    System.out.println("Deret Bilangan Ganjil");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2!=0)
                        System.out.print(i+" ");
                    } 
                    break;
            case 2 :
                    System.out.println("Deret Bilangan Genap");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    }
                    break;
        }
        System.out.println("");
    }

    private static class Scanner {

        public Scanner() {
        }

        private Scanner(InputStream in) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Scanner(java.io.InputStream in) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class InputStream {

        public InputStream() {
        }
    }
}
