/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119064.bagusbudiwibowo.no2;

import java.util.Scanner;
import model.Tabungan;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi program saldo tabungan setelah diambil 
 */
public class UTSIF210119064BAGUSBUDIWIBOWONo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("======Program Penarikan Uang======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(keyboard.nextInt());
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(keyboard.nextInt()));
    }
    
}
