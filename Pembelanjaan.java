/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.io.DataInputStream;
import java.io.IOException;

public class Pembelanjaan {

    String nama;
    double totalBelanja, diskonPersen, jumlahDiskon, totalSetelahDiskon, bayar, kembalian;

   
    DataInputStream dis = new DataInputStream(System.in);

    
    public void inputData() {
        try {
            System.out.print("Masukkan Nama Pembeli : ");
            nama = dis.readLine(); 

            System.out.print("Masukkan Total Belanja : ");
            totalBelanja = Double.parseDouble(dis.readLine()); 

            System.out.print("Masukkan Diskon (%)   : ");
            diskonPersen = Double.parseDouble(dis.readLine()); 

            System.out.print("Masukkan Uang Bayar   : ");
            bayar = Double.parseDouble(dis.readLine()); 

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
    }

  
    public void hitungBelanja() {
        
        jumlahDiskon = totalBelanja * (diskonPersen / 100);
        
        
        totalSetelahDiskon = totalBelanja - jumlahDiskon;
        
       
        kembalian = bayar - totalSetelahDiskon;
    }

 
    public void tampilkanOutput() {
        System.out.println("\n========================================");
        System.out.println("           STRUK PEMBELANJAAN           ");
        System.out.println("========================================");
        System.out.println("Nama Pembeli   : " + nama);
        System.out.println("Total Belanja  : Rp " + totalBelanja);
        System.out.println("Diskon (" + diskonPersen + "%) : Rp " + jumlahDiskon);
        System.out.println("Total Bayar    : Rp " + totalSetelahDiskon);
        System.out.println("Uang Dibayarkan: Rp " + bayar);
        System.out.println("Uang Kembalian : Rp " + kembalian);
        System.out.println("========================================");
    }
}
    
