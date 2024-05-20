public class Operazione2 extends Thread {
    Buffer dati;
    private double b;
    public Operazione2(Buffer buffer) {
        this.dati = buffer;
        this.b = dati.b;
    }

    public void run() {
        dati.v2 = Math.pow(2,b) + dati.v1;
        System.out.println(" Ho calcolato v2 = " + dati.v2);
    }
}