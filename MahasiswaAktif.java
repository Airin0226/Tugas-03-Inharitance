/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.tugas03;

/**
 *
 * @author ACER
 */
public class MahasiswaAktif extends Mahasiswa {

    // 2 atribut tambahan
    String organisasi;
    String statusKuliah;

    // Constructor turunan
    public MahasiswaAktif(String nim, String nama, String jurusan,
                           int semester, double ipk,
                           String organisasi, String statusKuliah) {

        super(nim, nama, jurusan, semester, ipk);

        this.organisasi = organisasi;
        this.statusKuliah = statusKuliah;
    }

    // Method tambahan 1
    public void ikutOrganisasi() {
        System.out.println(nama + " mengikuti organisasi " + organisasi);
    }

    // Method tambahan 2
    public String cekStatus() {
        return "Status kuliah: " + statusKuliah;
    }
}
    

