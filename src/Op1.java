public class Op1 extends Thread {
    Buffer dati;
    private double a;
    private double b;
    private double c;
    public Op1(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        thr1();
    }
    public void thr1() {
        dati.v1 = 4*a*c;
        System.out.println(" Ho calcolato v1 = " + dati.v1);
    }
    public void thr2() {
        dati.v2 = Math.pow(2,b) - (dati.v1);
        System.out.println(" Ho calcolato v2 = " + dati.v2);
    }
    public void thr3() {
        dati.v2 = Math.sqrt(dati.v2);
        System.out.println(" Ho calcolato la radice v2 = " + dati.v2);
    }
    public void thr4() {
        dati.x1 = (-b + dati.v2)/2;
        System.out.println(" Ho calcolato x1 = " + dati.x1);
    }
    public void thr5() {
        dati.x2 = (-b - Math.sqrt(dati.v2))/2*a;
        System.out.println(" Ho calcolato x2 = " + dati.x2);
    }
}