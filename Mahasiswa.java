/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.tugas03;

/**
 *
 * @author ACER
 */
public class Mahasiswa {

    // 5 atribut
    String nim;
    String nama;
    String jurusan;
    int semester;
    double ipk;

    // Constructor 1 (kosong)
    public Mahasiswa() {
        System.out.println("Constructor kosong dipanggil");
    }

    // Constructor 2 (2 parameter)
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Constructor 3 (semua parameter)
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }

    // CREATE (tanpa nilai balik)
    public void create() {
        String sql = "INSERT INTO mahasiswa VALUES ('"
                + nim + "', '"
                + nama + "', '"
                + jurusan + "', "
                + semester + ", "
                + ipk + ")";

        System.out.println("SQL CREATE:");
        System.out.println(sql);
    }

    // READ (dengan nilai balik)
    public String read() {
        String sql = "SELECT * FROM mahasiswa";

        return "SQL READ:\n" + sql;
    }

    // UPDATE (tanpa nilai balik)
    public void update() {
        String sql = "UPDATE mahasiswa SET "
                + "nama='" + nama + "', "
                + "jurusan='" + jurusan + "', "
                + "semester=" + semester + ", "
                + "ipk=" + ipk
                + " WHERE nim='" + nim + "'";

        System.out.println("SQL UPDATE:");
        System.out.println(sql);
    }

    // DELETE (dengan nilai balik)
    public String delete() {
        String sql = "DELETE FROM mahasiswa WHERE nim='" + nim + "'";

        return "SQL DELETE:\n" + sql;
    }

    // Method tambahan tanpa nilai balik
    public void tampilData() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("Semester  : " + semester);
        System.out.println("IPK       : " + ipk);
    }
}
    