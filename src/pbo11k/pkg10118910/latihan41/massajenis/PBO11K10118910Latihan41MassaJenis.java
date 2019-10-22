/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan41.massajenis;

/**
 *
 * @author
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 * Deskripsi Program : Program ini berisi program untuk menghitung massa jenis kubus 
 */
public class PBO11K10118910Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus k = new Kubus();
        k.setSisi(5);
        k.setMassa(250);
        
        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi\t\t: "+ k.getSisi());
        System.out.println("Massa\t\t: "+ k.getMassa());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume\t\t: "+ k.hitungVolume());
        System.out.println("Massa Jenis\t: "+ k.hitungMassajenis(k.getMassa(),k.hitungVolume()));
        
        
        
    }
    
}
