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
public class tampildata {
    public static void main(String[] args) {
        Karyawan1 Kar1 = new Karyawan1();
        Admin profl = new Admin();
        
        Kar1.setNamakaryawan("diah");
        Kar1.setGender("Perempuan");
        Kar1.cetak();
        profl.setnomorpegawai(333333);
        profl.cetak();
        System.out.println(profl.getnomorpegawai());
                profl.keterangan();
                profl.gaji(200000, 6);
                profl.gaji(200000, 6, 2);
        
        System.out.println("==================================");
    }
    
}
