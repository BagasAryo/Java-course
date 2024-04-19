package belajaran.setterGetter;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublesetter;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    public int getIntPrivate(){
        return this.intPrivate;
    }

    public void setDoubleSetter(double angka){
        this.doublesetter = angka;
        System.out.println(this.doublesetter);
    }
}

public class getter {
    public static void main(String[] args) {
        Data object1 = new Data();
        
        // read and write menggunakan public
        object1.intPublic = 10; // write
        System.out.println(object1.intPublic); // read

        // read only (gunakan getter)
        int number = object1.getIntPrivate();
        System.out.println("getter " + number);

        // write only (gunakan setter)
        object1.setDoubleSetter(100);
    }
}
