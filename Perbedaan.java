/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Perbedaan {
    public void demoScanner() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- DEMO CLASS SCANNER ---");
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Umur Anda : ");
        int umur = input.nextInt(); 
        
        System.out.println("Halo " + nama + ", umur Anda " + umur + " tahun.\n");
    }

   
    public void demoBufferedReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("--- DEMO CLASS BUFFEREDREADER ---");
            System.out.print("Masukkan Kota Asal : ");
            String kota = reader.readLine(); 
            
            System.out.print("Masukkan Tahun Lahir : ");
           
            int tahunLahir = Integer.parseInt(reader.readLine()); 
            
            System.out.println("Anda berasal dari " + kota + " dan lahir tahun " + tahunLahir + ".");
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        }
    }
}
