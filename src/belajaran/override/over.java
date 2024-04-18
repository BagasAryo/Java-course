package belajaran.override;

class Animal{
    public void move(){
        System.out.println("Animal can move");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Dog can move");
    }
}

public class over {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        a.move();
        b.move();
    }
}
