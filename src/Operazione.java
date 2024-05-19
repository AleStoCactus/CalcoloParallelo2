public class Operazione extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Operazione(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        dati.v1 = 4*a*c;
        System.out.println(" Ho calcolato v1 = " + dati.v1);
        dati.v2 = Math.pow(2,b) - dati.v1;
        System.out.println(" Ho calcolato v2 = " + dati.v2);
        System.out.println(" Ho calcolato la radice v2 = " + Math.sqrt(dati.v2));
        dati.x1 = (-b + Math.sqrt(dati.v2))/2;
        dati.x2 = (-b - Math.sqrt(dati.v2))/2;
        System.out.println(" Ho calcolato x1 = " + dati.x1);
        System.out.println(" Ho calcolato x2 = " + dati.x2);
    }
}