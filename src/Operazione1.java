public class Operazione1 extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Operazione1(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        dati.v1 = (-4)*a*c;
        System.out.println(" Ho calcolato v1 = " + dati.v1);
    }
}