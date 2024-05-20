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
        Operazione1 thr1 = new Operazione1(parziali);
        Operazione2 thr2 = new Operazione2(parziali);
        Operazione3 thr3 = new Operazione3(parziali);
        Operazione4 thr4 = new Operazione4(parziali);
        Operazione5 thr5 = new Operazione5(parziali);
        thr1.start();
        thr2.start();
        thr2.join();
        thr3.start();
        thr3.join();
        thr4.start();
        thr5.start();
    }
}