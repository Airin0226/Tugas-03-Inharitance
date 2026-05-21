/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inheritance.tugas03;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        
         // Object constructor kosong
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println();
        

        // Object constructor 2 parameter
        Mahasiswa mhs2 = new Mahasiswa("2410020128", "JUngkook");
        
        mhs2.tampilData();
        mhs2.create();
        System.out.println(mhs2.read());
        mhs2.update();
        System.out.println(mhs2.delete());

        System.out.println("====================");

        // Object constructor lengkap
        Mahasiswa mhs3 = new Mahasiswa(
                "2410020129",
                "Airin Nur Safrina",
                "Sistem Informasi",
                4,
                3.90
        );

        mhs3.tampilData();

        System.out.println("====================");

        // Object class turunan
        MahasiswaAktif aktif = new MahasiswaAktif(
                "2410020135",
                "Tzuyu",
                "Sistem Informasi",
                6,
                3.75,
                "HMPSI",
                "Aktif"
        );

        aktif.tampilData();
        aktif.ikutOrganisasi();
        System.out.println(aktif.cekStatus());

        // Jalankan CRUD juga
        aktif.create();
        System.out.println(aktif.read());
        aktif.update();
        System.out.println(aktif.delete());
    }
}
   
