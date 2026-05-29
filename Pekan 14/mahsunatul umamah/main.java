/*@author Taufiq*/
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Aditya", "12345", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Umamah", "250631100085", "Rekayasa Informatika");

        mhs1.tampilData();
        mhs2.tampilData();
    }
}
