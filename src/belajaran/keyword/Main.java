package belajaran.keyword;

class Player{
    String name; // default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default access modifier
    void display(){
        plusExp(); // setiap panggil display, exp nya nambah; contoh private methods
        System.out.println("Name \t: " + this.name);
        System.out.println("Exp \t: " + this.exp);
        System.out.println("Health \t: " + this.health);
    }

    public void setName(String newName){
        this.name = newName;
    }

    private void plusExp(){
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("putriirans",0, 100);
        
        // default
        System.out.println(player1.name); // membaca data
        player1.name = "sabila"; // menulis data
        System.out.println(player1.name); // membaca data

        //public
        System.out.println(player1.name); // membaca data
        player1.exp = 1; // menulis data
        System.out.println(player1.exp); // membaca data

        //private (tidak bisa diakses karena private)
        // System.out.println(player1.name); // membaca data
        // player1.health = 90; // menulis data
        // System.out.println(player1.health); // membaca data

        // methods

        // default
        player1.display();

        //public 
        player1.setName("bagas");
        player1.display();

        //private
        // player1.plusExp(); tidak bisa di akses dalam luar class
    }
}
