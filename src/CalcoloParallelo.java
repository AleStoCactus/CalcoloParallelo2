import java.util.Scanner;

public class CalcoloParallelo {
    public static void main(String[] args) throws Exception {
        System.out.println("Deco calcolare:" + " ");
        double a,b,c;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nInserisci a: ");
            a = scanner.nextDouble();
            System.out.println("\nInserisci b: ");
            b = scanner.nextDouble();
            System.out.println("\nInserisci c: ");
            c = scanner.nextDouble();
        }

        Buffer parziali = new Buffer(a,b,c);
        Operazione thr1 = new Operazione(parziali);
        thr1.start();
    }
}