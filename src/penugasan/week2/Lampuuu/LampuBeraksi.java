package penugasan.week2.Lampuuu;

import java.util.Scanner;

public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();
        Scanner inputLampu = new Scanner(System.in);
        String lampu = inputLampu.nextLine();
        lampuKamar.inputLampu(lampu);
        lampuKamar.hidupkan();
        lampuKamar.matikan();
        lampuKamar.matikan();
        lampuKamar.hidupkan();
        lampuKamar.hidupkan();

        inputLampu.close();
    }
}
