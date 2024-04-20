package penugasan.week2.Lampuuu;

public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();
        System.out.println("Status lampu saat ini: Hidup");
        lampuKamar.hidupkan();
        lampuKamar.matikan();
        lampuKamar.matikan();
        lampuKamar.hidupkan();
        lampuKamar.hidupkan();
    }
}
