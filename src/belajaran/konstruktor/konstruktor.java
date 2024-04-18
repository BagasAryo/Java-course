package belajaran.konstruktor;
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // ini adalah construktor, adalah method yang dipanggil saat object pertama kali dibuat
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        // System.out.println(nama);
        // System.out.println(NIM);
        // System.out.println(jurusan);
        
        // ini error kayaknya gpp dibiarin aja deh
    }
}

public class konstruktor {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("putri iran", "a11201914755", "sastra indonesia");
        Mahasiswa mhs2 = new Mahasiswa("rachel muthia", "a11201914756", "ilmu kelautan");

        // biar ga error, objek nya harus dipake. di kasus ini panggil objek sebagai output di sysout
        System.out.println("nama bidadari pertama adalah " + mhs1.nama + ", dengan NIM " + mhs1.NIM + ", dan berasal dari jurusan " + mhs1.jurusan);
        System.out.println("nama bidadari kedua adalah " + mhs2.nama + ", dengan NIM " + mhs2.NIM + ", dan berasal dari jurusan " + mhs2.jurusan);
    }
}
