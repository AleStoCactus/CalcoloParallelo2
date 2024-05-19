import java.util.Scanner;

public class CalcoloParallelo {
    public static void main(String[] args) throws Exception {
        System.out.println("Deco calcolare:" + " 3*(a-1) + 2*(b-2) + 3*(c-3) ");
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
        thr1.start();
        Operazione2 thr2 = new Operazione2(parziali);
        thr2.start();
        Operazione3 thr3 = new Operazione3(parziali);
        thr3.start();
        try {
            thr2.join();
            thr3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Operazione4 thr4 = new Operazione4(parziali);
        thr4.start();
        Operazione5 thr5 = new Operazione5(parziali);
        thr5.start();



    }
}