package belajaran.overloading;

public class math {
    public static int tambah(int x, int y){
        return x+y;
    }

    public static double tambah(int x, double y){
        return x+y;
    }

    public static void mul(int a, int b){
        int hasil = a + b;
        System.out.println("hasilnya adalah : " + hasil);
    }

    public static void mul(){
        System.out.println("checking the overloading algorithm");
    }
}
