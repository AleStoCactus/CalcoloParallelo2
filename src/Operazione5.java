public class Operazione5 extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Operazione5(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        dati.x2 = (-b - Math.sqrt(dati.v2))/2;
        System.out.println(" Ho calcolato x2 = " + dati.x2);
    }
}