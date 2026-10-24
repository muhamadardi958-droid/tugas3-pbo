
package praktikum3;
  import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //1.
        Gajipegawai gp = new Gajipegawai();

        System.out.println("=== PROGRAM INPUT DATA GAJI PEGAWAI ===");
        
        System.out.print("Masukkan NIP               : ");
        gp.nip = input.nextLine();

        System.out.print("Masukkan Nama Karyawan     : ");
        gp.nama = input.nextLine();

        System.out.print("Masukkan Alamat            : ");
        gp.alamat = input.nextLine();

        System.out.print("Masukkan Jabatan           : ");
        gp.jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok        : ");
        gp.gajiPokok = input.nextDouble();

        System.out.print("Masukkan Tunjangan Jabatan : ");
        gp.tunjanganJabatan = input.nextDouble();

       System.out.print("Masukkan Tunjangan Istri   : ");
        gp.tunjanganAnak = input.nextDouble(); 

        System.out.print("Masukkan Tunjangan Anak    : ");
        gp.tunjanganAnak = input.nextDouble();
        
        gp.tampilkanData();
       
        
        //2.
        Pembelanjaan transaksi = new Pembelanjaan();
        transaksi.inputData();
        transaksi.hitungBelanja();
        transaksi.tampilkanOutput();
        
        //3.j
        Perbedaan demo = new Perbedaan();
        demo.demoScanner();
        demo.demoBufferedReader();
 
         //4
        Sentri h = new Sentri();

        h.inputData();
        h.hitungGaya();
       h.tampilkanHasil();
    

   //5
        Buah b = new Buah();

        b.inputData();
        b.hitungTotal();
      b.tampilkanHasil();
   
    //6.
        Waktu w = new Waktu();

        w.inputData();
        w.hitungSelisih();
        w.tampilkanHasil();
    
     //7.
        Novel m = new Novel();

        m.inputData();
        m.hitungWaktuCetak();
        m.tampilkanHasil(); 
        
        input.close();

  }
  }

