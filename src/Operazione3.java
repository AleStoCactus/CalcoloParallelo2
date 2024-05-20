public class Operazione3 extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Operazione3(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        dati.v2 = Math.sqrt(dati.v2);
        System.out.println(" Ho calcolato la radice v2 = " + dati.v2);
    }
}