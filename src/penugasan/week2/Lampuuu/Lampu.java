package penugasan.week2.Lampuuu;

interface InterfaceLampu {
    public static final int KeadaanHidup = 0;
    public static final int KeadaanMati = 1;

    public abstract void hidupkan();
    public abstract void matikan();
    public abstract void inputLampu(String stateLampu);
}

public class Lampu implements InterfaceLampu{
    int statusLampu;

    public void inputLampu(String stateLampu){
        if (stateLampu == "hidup") {
            this.statusLampu = 0;
        } else if (stateLampu == "mati") {
            this.statusLampu = 1;
        }
    }

    public void hidupkan(){
        if(this.statusLampu == KeadaanMati){
            this.statusLampu = KeadaanHidup;
            System.out.println("Hidupkan Lampu! -> Lampu hidup");
        }else{
            System.out.println("Hidupkan Lampu! -> Lampu sudah hidup kok");
        }
    }
    public void matikan(){
        if(this.statusLampu == KeadaanHidup){
            this.statusLampu = KeadaanMati;
            System.out.println("Matikan Lampu! -> Lampu mati");
        }else{
            System.out.println("Matikan Lampu! -> Lampu sudah mati kok");
        }
    }
}
