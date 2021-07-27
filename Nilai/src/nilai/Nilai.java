/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

import java.util.Scanner;

/**
 *
 * @author Kanzu
 */
public class Nilai {

    
      
     
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double Nilai_Akhir;

char grade;

String hasil;

System.out.print(“Masukan NIM Anda :”); String NIM = sc.next();

System.out.print(“Masukan Nama Anda :”); String Nama = sc.next();

System.out.print(“Masukan Nilai UTS :”); Integer UTS = sc.nextInt();

System.out.print(“Masukan Nilai UAS :”); Integer UAS = sc.nextInt();

Nilai_Akhir = 0.4*UTS + 0.6*UAS;

System.out.println(“======================================”);

System.out.println(“======================================”);

System.out.println(“Nim Anda :”+NIM);

System.out.println(“Nama Anda :”+Nama);

System.out.println(“Nilai UTS Anda :”+UTS);

System.out.println(“Nilai UAS Anda :”+UAS);

System.out.println(“Nilai Akhir Anda :”+Nilai_Akhir);

if(Nilai_Akhir >= 80){

grade = ‘A’;

hasil = “Lulus”;

}

else if(Nilai_Akhir >= 70){

grade = ‘B’;

hasil = “Lulus”;

}

else if(Nilai_Akhir >= 55){

grade = ‘C’;

hasil = “Lulus”;

}

else if(Nilai_Akhir >= 45){

grade = ‘D’;

hasil = “Tidak Lulus”;

}

else {

grade = ‘E’;

hasil = “Tidak Lulus”;

}

 

System.out.println(“Hasil Kelulusan Anda :”+hasil);

System.out.println(“Anda mendapatkan Grade :”+grade);

 

}

}