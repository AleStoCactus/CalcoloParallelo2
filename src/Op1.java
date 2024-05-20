public class Op1 extends Thread {
    Buffer dati;
    private int a;
    private int b;
    private int c;
    public Op1(Buffer buffer) {
        this.dati = buffer;
        this.a = dati.a;
        this.b = dati.b;
        this.c = dati.c;
    }

    public void run() {
        int r1 = thr1();
        int r2 = thr2();
        int r3 = thr3();
        int r4 = thr4();
        int r5 = thr5();
    }
    private int thr1() {
        dati.v1 = 4*a*c;
        System.out.println(" Ho calcolato v1 = " + dati.v1);
        return dati.v1;
    }
    private int thr2() {
        dati.v2 = (int) (Math.pow(2,b) - (dati.v1));
        System.out.println(" Ho calcolato v2 = " + dati.v2);
        return dati.v2;
    }
    private int thr3() {
        dati.v2 = (int) Math.sqrt(dati.v2);
        System.out.println(" Ho calcolato la radice v2 = " + dati.v2);
        return dati.v2;
    }
    private int thr4() {
        dati.x1 = (-b + dati.v2)/2;
        System.out.println(" Ho calcolato x1 = " + dati.x1);
        return dati.x1;
    }
    private int thr5() {
        dati.x2 = (int) ((-b - Math.sqrt(dati.v2))/2*a);
        System.out.println(" Ho calcolato x2 = " + dati.x2);
        return dati.x2;
    }
}