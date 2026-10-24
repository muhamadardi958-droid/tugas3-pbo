
package praktikum3;

import java.util.Scanner;

public class Waktu {
    int jam1, menit1, detik1;
    int jam2, menit2, detik2;
    int totalDetik1, totalDetik2, selisihDetik;
    int hasilJam, hasilMenit, hasilSisaDetik;

    Scanner input = new Scanner(System.in);

    
    public void inputData() {
        System.out.println("--- PROGRAM MENGHITUNG SELISIH WAKTU ---");
        System.out.println("Masukkan Waktu Pertama:");
        System.out.print("Jam   : ");
        jam1 = input.nextInt();
        System.out.print("Menit : ");
        menit1 = input.nextInt();
        System.out.print("Detik : ");
        detik1 = input.nextInt();

        System.out.println("\nMasukkan Waktu Kedua:");
        System.out.print("Jam   : ");
        jam2 = input.nextInt();
        System.out.print("Menit : ");
        menit2 = input.nextInt();
        System.out.print("Detik : ");
        detik2 = input.nextInt();
    }
    
    public void hitungSelisih() {
       
        totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
      
        totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        selisihDetik = Math.abs(totalDetik2 - totalDetik1);
        hasilJam = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        hasilMenit = sisaDetik / 60;
        hasilSisaDetik = sisaDetik % 60;
    }

    public void tampilkanHasil() {
        System.out.println("\n===========================================");
        System.out.println("            HASIL SELISIH WAKTU            ");
        System.out.println("===========================================");
        System.out.println("Waktu 1 : " + jam1 + " jam " + menit1 + " menit " + detik1 + " detik");
        System.out.println("Waktu 2 : " + jam2 + " jam " + menit2 + " menit " + detik2 + " detik");
        System.out.println("-------------------------------------------");
        System.out.println("Selisih : " + hasilJam + " jam " + hasilMenit + " menit " + hasilSisaDetik + " detik");
        System.out.println("===========================================");
    }
    
}
