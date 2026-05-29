class Mahasiswa {

    String nama;
    String nim;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method tampilData
    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println();
    }

    public static void main(String[] args) {

        // Object 1
        Mahasiswa mhs1 = new Mahasiswa(
            "Kafila", 
            "080", 
            "Informatika"
        );

        // Object 2
        Mahasiswa mhs2 = new Mahasiswa(
            "Qomsriyah", 
            "094", 
            "Sistem Informasi"
        );

        // Menampilkan data
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
