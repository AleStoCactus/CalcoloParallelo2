public class Buffer {
    public double x1, x2, v1, v2, a, b, c;
    public Buffer (double aa, double bb, double cc) {
        x1 = 0; x2 = 0; v1 = 0; v2 = 0;
        a = aa;
        b = bb;
        c = cc;
        System.out.println(" I parametri valgono: a=" + a + " b=" + b + " c=" + c);
    }
}