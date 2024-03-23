package penugasan.kalkulator;

class Kalkulator {
    float one;
    float two;
    float result;


    Kalkulator(float angka1, float angka2, char oper){
        this.one = angka1;
        this.two = angka2;

        if (oper == '+') {
            this.result = this.one + this.two;
        } else if (oper == '-') {
            this.result = this.one - this.two;
        } else if (oper == '*') {
            this.result = this.one * this.two;
        } else if (oper == '/') {
            this.result = this.one / this.two;
        } else {
            System.out.println("Invalid operator. ");
        }
    }

    void show() {
        System.out.println("Hasil dari operasi " + this.one + " dan " + this.two + " adalah " + this.result);
    }
}