
package oop1;

public class kelulusan {
    
    public static void main(String[] args) {
        siswa pelajar = new siswa ();
        
        pelajar.nama= "Kanzu";
        pelajar.nilai= 60;
        
        pelajar.cetaknilai();
        
        if(pelajar.lulus()){
            System.out.println("Selamat anda Lulus");
        }
        else if(pelajar.tidaklulus()){
            System.out.println("Anda harus belajar lebih giat lagi");
        }
    }
    
}
