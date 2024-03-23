package penugasan.kalkulator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float num1, num2;
        char operator;
        
        System.out.println("input angka pertama anda: ");
        num1 = input.nextInt();
        System.out.println("input angka pertama anda: ");
        num2 = input.nextInt();
        System.out.println("input operator : ");
        operator = input.next().charAt(0);
        
        Kalkulator act = new Kalkulator(num1, num2, operator);
        act.show();

        input.close();
    }
}
