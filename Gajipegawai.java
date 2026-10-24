
package praktikum3;


import java.util.Scanner;
public class Gajipegawai {
    String nip;
    String nama;
    String alamat;
    String jabatan;
    double gajiPokok;
    double tunjanganJabatan;
    double tunjanganIstri;
    double tunjanganAnak;
    
    
    double hitungTotalGaji() {
        return gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
    }
    
    double hitungPajak() {
        return 0.10 * hitungTotalGaji();
    }
    
    double hitungGajiBersih() {
        return hitungTotalGaji() - hitungPajak();
    }
    
   public void tampilkanData() {
        System.out.println("\n========================================");
        System.out.println("          STRUK GAJI PEGAWAI            ");
        System.out.println("========================================");
        System.out.println("Nomor Induk Karyawan : " + nip);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : Rp " + gajiPokok);
        System.out.println("Tunjangan Jabatan    : Rp " + tunjanganJabatan);
        System.out.println("Tunjangan Istri      : Rp " + tunjanganIstri);
        System.out.println("Tunjangan Anak       : Rp " + tunjanganAnak);
        System.out.println("----------------------------------------");
        System.out.println("Total Gaji           : Rp " + hitungTotalGaji());
        System.out.println("Pajak Penghasilan    : Rp " + hitungPajak());
        System.out.println("Gaji Bersih          : Rp " + hitungGajiBersih());
        System.out.println("========================================");
    }

    
}

    