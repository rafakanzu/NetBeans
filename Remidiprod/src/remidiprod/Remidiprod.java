/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidiprod;

import java.util.Scanner;

/**
 *
 * @author Kanzu
 */
public class Remidiprod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String nama,kelas,absen;
       char grade;
       final double tugas1,tugas2,tugas3,uts,uas,praktik,nilaiakhir,semuatugas;
       
       System.out.println("<===== PENILAIAN PRODUKTIF RPL KELAS X =====>\n");
       
       System.out.println("Nama :");
       nama = input.nextLine();
       
       System.out.println("KELAS :");
       kelas = input.nextLine();
       
       System.out.println("ABSEN :");
       absen = input.nextLine();
       
       System.out.println("Nilai TUGAS 1 :");
       tugas1 = input.nextInt();
       
       System.out.println("Nilai TUGAS 2 :");
       tugas2 = input.nextInt();
       
       System.out.println("Nilai TUGAS 3 :");
       tugas3 = input.nextInt();
       
       System.out.println("Nilai PRAKTIK :");
       praktik = input.nextInt();
       
       System.out.println("Nilai UTS :");
       uts = input.nextInt();
       
       System.out.println("Nilai UAS :");
       uas = input.nextInt();
       
       semuatugas = ((tugas1 + tugas2 + tugas3) /3);
       nilaiakhir = (0.20 * semuatugas + 0.30 * praktik + 0.25 * uts + 0.25 * uas);
       if (nilaiakhir >=85 && nilaiakhir <=100){
           grade = 'A';
       }
       else if (nilaiakhir >75 && nilaiakhir <85){
           grade = 'B';
       }
       else if (nilaiakhir >60 && nilaiakhir <75){
           grade = 'C';
       }
       else if (nilaiakhir >50 && nilaiakhir <60){
           grade = 'D';
       }
       else {
           grade = 'E';
       }
       if (grade == 'A'|| grade == 'B' || grade == 'C'){
           System.out.println("\n" + nama + " Dari Kelas " + kelas + "/" + absen + " Memiliki Nilai Akhir " + nilaiakhir + " = (" +grade+ ")" + "" + " \n dan dinyatakan lulus ");
       }
       else {
           System.out.println("\n" + nama + " Dari Kelas " + kelas + "/" + absen + " Memiliki Nilai Akhir " + nilaiakhir + " = (" +grade+ ")" + "" + " \n dan dinyatakan tidak lulus ");
       }
       if (tugas1 <75){
           System.out.println("");
           System.out.println("Nilai TUGAS 1 Perlu Diperbaiki");
       }
       if (tugas2 <75){
           System.out.println("");
           System.out.println("Nilai TUGAS 2Perlu Diperbaiki");
       }
       if (tugas3 <75){
           System.out.println("");
           System.out.println("Nilai TUGAS 3 Perlu Diperbaiki");
       }
       if (praktik <75){
           System.out.println("");
           System.out.println("Nilai PRAKTIK Perlu Diperbaiki");
       }
       if (uts <75){
           System.out.println("");
           System.out.println("Nilai UTS Perlu Diperbaiki");
       }
       if (uas <75){
           System.out.println("");
           System.out.println("Nilai UAS Perlu Diperbaiki");
       }
    }
    
}
