public class Operazione3 extends Thread {
    Buffer dati;
    public Operazione3(Buffer buffer) {
        this.dati = buffer;
    }

    public void run() {
        dati.v2 = Math.sqrt(dati.v2);
        System.out.println(" Ho calcolato la radice v2 = " + dati.v2);
    }
}