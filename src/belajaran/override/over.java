package belajaran.override;
public class over {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "tatsuya";
        // hero1.gender = "otoko";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "miyuki";
        hero2.defensePower = 55;
        hero2.display();
    }
}
