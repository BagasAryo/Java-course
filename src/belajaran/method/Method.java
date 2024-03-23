package belajaran.method;

class Mahasiswa{
    // data member
    String nama = "class putri iran";
    String NIM;

    // constructor 
    Mahasiswa(String nama, String inputNIM){
        // this.nama itu punya nya class Mahasiswa atau mhs1, nama punya nya local di parameter construktor Mahasiswa
        this.nama = nama;
        this.NIM = inputNIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter 
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan parameter
    String greeting(String message){
        return "hai " + message + ", udah sembuh nih. so sorry, nama aku " + this.nama;
    }
}

public class Method {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("putri iran", "14756");
        // 
        mhs1.show();
        mhs1.setNama("putriirans");
        mhs1.show();

        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNIM());

        System.out.println(mhs1.greeting("deann"));
    }
}
