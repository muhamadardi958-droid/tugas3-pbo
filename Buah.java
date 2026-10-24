
package praktikum3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buah {
    int manggaBeli, jumlahTetangga, jambuPerTetangga, manggaBusuk;
    int totalJambu, manggaBagus, totalBuah;

    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    
    public void inputData() {
        try {
            System.out.println("--- INPUT DATA BUAH IBU SISCA ---");
            System.out.print("Masukkan jumlah mangga yang dibeli : ");
            manggaBeli = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan jumlah tetangga           : ");
            jumlahTetangga = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan jambu per tetangga (pcs)  : ");
            jambuPerTetangga = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan jumlah mangga yang busuk  : ");
            manggaBusuk = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
    }

   
    public void hitungTotal() {
        
        totalJambu = jumlahTetangga * jambuPerTetangga;
        manggaBagus = manggaBeli - manggaBusuk;
        totalBuah = manggaBagus + totalJambu;
    }

    
    public void tampilkanHasil() {
        System.out.println("\n===========================================");
        System.out.println("            HASIL PERHITUNGAN BUAH         ");
        System.out.println("===========================================");
        System.out.println("Jumlah Mangga Bagus (70 - 15) : " + manggaBagus + " pcs");
        System.out.println("Total Buah Jambu (4 x 30)     : " + totalJambu + " pcs");
        System.out.println("-------------------------------------------");
        System.out.println("Total Buah Akhir Ibu Sisca    : " + totalBuah + " pcs");
        System.out.println("===========================================");
    }
}
    

