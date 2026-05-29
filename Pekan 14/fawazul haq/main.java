class Mahasiswa {
    // Atribut
    String nama;
    String nim;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method tampilData()
    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {

        // Membuat 2 object
        Mahasiswa mhs1 = new Mahasiswa(
                "FAFA",
                "23001",
                "Teknik Informatika"
        );

        Mahasiswa mhs2 = new Mahasiswa(
                "FUFU",
                "23002",
                "Sistem Informasi"
        );

        // Menampilkan data
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
