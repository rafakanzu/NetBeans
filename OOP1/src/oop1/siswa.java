package oop1;


public class siswa {

   String nama;
   int nilai;
   
   public void cetaknilai(){
       System.out.println("Nilai Produktif RPL 6 " +nama+" adalah =" +nilai);
   }
   
   public boolean lulus(){
       return nilai>=75;
   }
   public boolean tidaklulus(){
       return nilai<74;
   }
    
    
    
}
