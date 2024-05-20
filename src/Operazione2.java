public class Operazione2 extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Operazione2(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        dati.v2 = Math.pow(2,b) + dati.v1;
        System.out.println(" Ho calcolato v2 = " + dati.v2);
    }
}