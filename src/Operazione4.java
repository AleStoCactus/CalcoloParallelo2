public class Operazione4 extends Thread {
    Buffer dati;
    private double b;
    public Operazione4(Buffer buffer) {
        this.dati = buffer;
        this.b = dati.b;
    }

    public void run() {
        dati.x1 = (-b + dati.v2)/2;
        System.out.println(" Ho calcolato x1 = " + dati.x1);
    }
}