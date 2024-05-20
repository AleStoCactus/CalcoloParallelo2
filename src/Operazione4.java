public class Operazione4 extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Operazione4(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        dati.x1 = (-b + dati.v2)/2;
        System.out.println(" Ho calcolato x1 = " + dati.x1);
    }
}