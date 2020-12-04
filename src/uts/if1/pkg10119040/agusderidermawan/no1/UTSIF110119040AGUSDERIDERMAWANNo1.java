/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119040.agusderidermawan.no1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author User
 * Nama     : Agus deri dermawan
 * NIM      : 10119040
 * Kelas    : IF1
 * ---UTS---
 * Deskripsi Program : program menampilkan umur dengan metode
 * pendekatan berbasis objek
 */
public class UTSIF110119040AGUSDERIDERMAWANNo1 {
static int umur;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearnow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearnow);
        System.out.println("masukkan tahun lahir anda :");
        age.setYearbirth( scanner.nextInt());
        System.out.println("==========hasil perhitungan umur============");
        System.out.println("tahun lahir anda: "+age.getYearbirth());
        System.out.println("hari ini tahun: "+age.getYearnow());
        System.out.println("umur kamu samapai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("tandanya kamu "+age.tandanyakamu(umur));
    }
}