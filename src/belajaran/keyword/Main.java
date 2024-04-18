package belajaran.keyword;

class Player{
    String name; // default

    Player(String name){
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("putriirans");
        System.out.println(player1.name); // 
    }
}
