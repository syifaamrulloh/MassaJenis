/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan41.massajenis;

/**
 *
 * @author
 * Nama : Muhamad Syifa Amruloh
 * Kelas: IF11K
 * NIM  : 10118910
 * 
 * Deskripsi : Menghitung masa jenis kubus
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(){
        return sisi*sisi*sisi;
    }
    
    public int hitungMassajenis(int parMassa,int volume){
        return parMassa / volume ;
    }
}
