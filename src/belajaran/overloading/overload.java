package belajaran.overloading;

public class overload {
    public static void main(String[] args) {
        // overloading pada constructor
        pemain player1 = new pemain("putriirans");
        pemain player2 = new pemain();
        pemain player3 = new pemain();
        pemain player4 = new pemain("shariyah crilley");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading methods
        int a = math.tambah(5, 9);
        System.out.println(a);
        double b = math.tambah(20, 5);
        System.out.println(b);

        math.mul(5, 10);
        math.mul();

    }
}
