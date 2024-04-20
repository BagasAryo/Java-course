package belajaran.InterfaceTutorial.hero;

public class Hero implements IAttack{
    private String name;
    private double health;

    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public void attack(Hero enemy){
        System.out.println(this.name + " attacks " + enemy.name);
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Name : " + this.health);
    }
}
