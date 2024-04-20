package belajaran.override;

public class HeroStrength extends Hero {
    double defensePower;

    // overriding methods => menimpa method dengan nama yang sama yang ada di super class
    public void display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero name : " + this.name);
        System.out.println("Defense Power : " + this.defensePower);
        System.out.println("Hero Gender : " + super.gender);
    }
}
