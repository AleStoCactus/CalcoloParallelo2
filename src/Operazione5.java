public class Operazione5 extends Thread {
    Buffer dati;
    private double b;
    public Operazione5(Buffer buffer) {
        this.dati = buffer;
        this.b = dati.b;
    }

    public void run() {
        dati.x2 = (-b - Math.sqrt(dati.v2))/2;
        System.out.println(" Ho calcolato x2 = " + dati.x2);
    }
}