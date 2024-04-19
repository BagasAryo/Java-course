package belajaran.overloading;

class pemain {
    String name;
    private static int jumlahPlayer;

    pemain(String name){
        pemain.jumlahPlayer++;
        this.name = name;
    }
    
    pemain(){
        pemain.jumlahPlayer++;
        this.name = "player" + pemain.jumlahPlayer;
    }

    void show(){
        System.out.println("Name Player : " + this.name);
    }
}
