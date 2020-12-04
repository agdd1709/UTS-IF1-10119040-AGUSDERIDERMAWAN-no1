/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119040.agusderidermawan.no1;

/**
 *
 * @author User
 * Nama     : Agus
 * NIM      : 10119040
 * Kelas    : IF1
 * ---UTS---
 * Deskripsi Program : program menampilkan umur dengan metode
 * pendekatan berbasis objek
 */
public class Age {
    private int yearbirth,yearnow;
    private final String red ="\u001B[31m"; 
    public Age(int yearnow) {
       this.yearnow=yearnow;
    }
    public int getYearbirth() {
        return yearbirth;
    }
    public void setYearbirth(int yearbirth) {
        this.yearbirth = yearbirth;
    }
    public int getYearnow() {
        return yearnow;
    }
    public void setYearnow(int yearnow) {
        this.yearnow = yearnow;
    }
    public int hitungUmur(){
        return yearnow-yearbirth;
    } 
    public String tandanyakamu(int umur){
        String tanda;
        umur = hitungUmur();
        if(0>umur&&umur<=5)tanda="LAGI LUCU-LUCUNYA";       
        else if(5>umur&&umur<=10)tanda="MASIH ANAK ANAK";
        else if(10>umur&&umur<=13)tanda="MASIH REMAJA";
        else if(13>umur&&umur<=19)tanda="ALAY";
        else if(19>umur&&umur<=29)tanda="LAGI GALAU NYARI JODOH";  
        else if(29>umur&&umur<=35)tanda="LAGI SIBUK NYARI UANG";
        else if(35>umur&&umur<=150)tanda="SUDAH TUA";
        else  tanda="TIDAK TERDETEKSI DIKEHIDUPAN";    
        return red+tanda;
    } 
}
