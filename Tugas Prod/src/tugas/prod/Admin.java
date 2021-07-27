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
public class Admin  extends Karyawan1{
    int nomorpegawai;
    
    public void keterangan(){
        super.profesi();
        System.out.println("admin");
    }
    public void setnomorpegawai (int nomorPegawai){
        this.nomorpegawai=nomorPegawai;
    }
    public int getnomorpegawai (){
        return nomorpegawai;
        
    }
    // overloading
    public void gaji(int pokok, int bonus){
        int total = pokok * bonus;
        System.out.println("gaji utama yang didapat "+total);
    }
    public void gaji (int pokok, int bonus, int tambahan){
        int total=pokok* bonus *tambahan;
        System.out.println("gaji yang didapat jika bekerja secara baik");
    }
    public void cetak(){
        System.out.print("nomor pegawai");
    
    }

}
