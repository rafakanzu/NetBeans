/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi;

import java.util.Scanner;

/**
 *
 * @author Kanzu
 */
public class Remidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String Nama,Absen,Kelas;
        final double Tugas1 = 0,Tugas2 = 0,Tugas3 = 0,Praktik = 0,Ujian = 0,BTugas,BPraktik,BUjian;
        char grade;
        System.out.println("====DATA NILAI PRODUKTIF KELAS X====");
        
        System.out.print("Nama Lengkap :");
                String nama = input.nextLine();
        System.out.print("Absen :");
                String absen = input.nextLine();
        System.out.print("Kelas :");            
        String kelas = input.nextLine();
        System.out.print("Nilai Tugas 1 :");
        int tugas1 = input.nextInt();
        System.out.print("Nilai Tugas 2 :");
        int tugas2 = input.nextInt();
        System.out.print("Nilai Tugas 3 :");
        int tugas3 = input.nextInt();
        System.out.print("Nilai Praktik :");
        int praktik = input.nextInt();
        System.out.print("Nilai Ujian :");
        int ujian = input.nextInt();
        
        
        BTugas = ((Tugas1+Tugas2+Tugas3) * 1/5);
        BPraktik = (Praktik * 3/10);
        BUjian = (Ujian * 1/2);
        double Total = BTugas+BPraktik+BUjian;
        System.out.print("Nilai Total = "+Total+"\n");
        if (Total >=75 && Total <=100){
            grade = 'A';
        }
        else if (Total > 75 && Total < 85){
            grade = 'B';
        }
        else if (Total > 65 && Total < 75){
            grade = 'C';
        }
        else if (Total > 50 && Total < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade = 'B' || grade == 'C'){
            System.out.println("\n"+nama+"Dari"+kelas+"Nomer Absen"+absen+"Mendapat Nilai Akhir"+Total+("grade")+"\n  dan dinyatakan lulus");       
        }
        else {
            System.out.println("\n"+nama+"Dari"+kelas+"Nomer Absen"+absen+"Mendapat Nilai Akhir"+Total+("grade")+"\n  dan dinyatakan tidak lulus");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
}
