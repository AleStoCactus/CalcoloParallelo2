import java.util.Scanner;

public class CalcoloParallelo {
    public static void main(String[] args) throws Exception {
        System.out.println("Devo calcolare x1 e x2 per la risoluzione delle equazioni di secondo grado");
        int a,b,c;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nInserisci a: ");
            a = scanner.nextInt();
            System.out.println("\nInserisci b: ");
            b = scanner.nextInt();
            System.out.println("\nInserisci c: ");
            c = scanner.nextInt();
        }

        Buffer parziali = new Buffer(a,b,c);
        Op1 thr1 = new Op1(parziali);
        thr1.start();
    }
}