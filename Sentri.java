
package praktikum3;

import java.util.Scanner;
public class Sentri {
    double massa, kecepatan, jariJari, gayaSentripetal;
    Scanner input = new Scanner(System.in);

    public void inputData() {
        System.out.println("--- PROGRAM MENGHITUNG GAYA SENTRIPETAL ---");
        System.out.print("Masukkan Massa Benda (M) dalam kg  : ");
        massa = input.nextDouble();

        System.out.print("Masukkan Kecepatan (V) dalam m/s   : ");
        kecepatan = input.nextDouble();

        System.out.print("Masukkan Jari-jari (r) dalam meter : ");
        jariJari = input.nextDouble();
    }

   
    public void hitungGaya() {
        gayaSentripetal = (massa * (kecepatan * kecepatan)) / jariJari;
    }

    
    public void tampilkanHasil() {
        System.out.println("\n===========================================");
        System.out.println("              HASIL PERHITUNGAN            ");
        System.out.println("===========================================");
        System.out.println("Massa Benda (M)       : " + massa + " kg");
        System.out.println("Kecepatan (V)         : " + kecepatan + " m/s");
        System.out.println("Jari-jari (r)         : " + jariJari + " meter");
        System.out.println("-------------------------------------------");
        System.out.println("Gaya Sentripetal (Fc) : " + gayaSentripetal + " Newton");
        System.out.println("===========================================");
    }
}
    
