/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan gaji karyawan

 */
public class PBO210118084Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan = new Karyawan();      
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK :");
        karyawan.setNik(scanner.next());
        System.out.print("Masukkan Nama :");
        karyawan.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) :");
        karyawan.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) :");
        karyawan.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran :");
        manager.setKehadiran(scanner.nextInt());
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK     :"+karyawan.getNik());
        System.out.println("Nama    :"+karyawan.getNama());
        System.out.println("GOLONGAN:"+karyawan.getGolongan());
        System.out.println("JABATAN :"+karyawan.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN  :"+manager.tunjanganGolongan(karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   :"+manager.tunjanganJabatan(karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN :"+manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL  :"+manager.gajiTotal(manager.tunjanganGolongan(karyawan.getGolongan()),manager.tunjanganJabatan(karyawan.getJabatan()),manager.tunjanganKehadiran(manager.getKehadiran())));
        
        
        
        
    }
    
}
