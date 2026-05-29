public class mahasiswa {

    String nama;
    String nim;
    String jurusan;

    mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        mahasiswa mhs1 = new mahasiswa(
                "Zhilvia",
                "250631100084",
                "Informatika"
        );

        mahasiswa mhs2 = new mahasiswa(
                "Alya",
                "23110002",
                "Sistem Informasi"
        );

        mhs1.tampilData();
        mhs2.tampilData();
    }
} 
{
    
}
