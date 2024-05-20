import java.util.Scanner;

public class CalcoloParallelo {
    public static void main(String[] args) throws Exception {
        System.out.println("Devo calcolare x1 e x2 per la risoluzione delle equazioni di secondo grado");
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
        Op1 thr1 = new Op1(parziali);
        Op1 thr2 = new Op1(parziali);
        Op1 thr3 = new Op1(parziali);
        Op1 thr4 = new Op1(parziali);

        thr1.start();
        thr2.start();
        thr2.join();
        thr3.start();
    }
}