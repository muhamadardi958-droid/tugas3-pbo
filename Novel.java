
package praktikum3;

import java.util.Scanner;

public class Novel {
     int jumlahNovel, tebalPerNovel;
    long totalLembar; 
    long sisaDetik;
    int hari, jam, menit, detik;

    Scanner input = new Scanner(System.in);

    public void inputData() {
        System.out.println("--- PROGRAM PERHITUNGAN WAKTU CETAK NOVEL ---");
        System.out.print("Masukkan Jumlah Novel yang Akan Dicetak : ");
        jumlahNovel = input.nextInt();

        System.out.print("Masukkan Tebal Lembar per Novel          : ");
        tebalPerNovel = input.nextInt();
    }

  
    public void hitungWaktuCetak() {
        
        totalLembar = (long) jumlahNovel * tebalPerNovel;

        sisaDetik = totalLembar;

        hari = (int) (sisaDetik / 86400);
        sisaDetik = sisaDetik % 86400;

        jam = (int) (sisaDetik / 3600);
        sisaDetik = sisaDetik % 3600;

        menit = (int) (sisaDetik / 60);
          
        detik = (int) (sisaDetik % 60);
    }


    public void tampilkanHasil() {
        System.out.println("\n===========================================");
        System.out.println("           HASIL WAKTU PENGERJAAN          ");
        System.out.println("===========================================");
        System.out.println("Jumlah Novel       : " + jumlahNovel + " buah");
        System.out.println("Tebal per Novel    : " + tebalPerNovel + " lembar");
        System.out.println("Total Seluruh Lembar: " + totalLembar + " lembar");
        System.out.println("-------------------------------------------");
        System.out.println("Waktu yang Dibutuhkan:");
        System.out.println("-> " + hari + " Hari");
        System.out.println("-> " + jam + " Jam");
        System.out.println("-> " + menit + " Menit");
        System.out.println("-> " + detik + " Detik");
        System.out.println("===========================================");
    }
    
}
