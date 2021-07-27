/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.prod;

/**
 *
 * @author Kanzu
 */
public class Karyawan1 extends Karyawan {
    
    public void setNamakaryawan(String nama) {
        super.nama = nama;
    }
    public void setGender (String gender){
        super.gender=gender;    
    }
    public void cetak(){
        super.Identitas();
    }
    public void profesi (){
        System.out.print("Bekerja di bagian");
    }
    
    
}
