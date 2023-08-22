package ComplexMultiplication;
import java.util.Scanner;

public class ComplexMultiplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int r = a1*a2-b1*b2;
        int i = a1*b2 + b1*a2;

        if (r != 0) {
            System.out.print(r);
        }

        if (i != 0) {
            if (i > 0 && r != 0) {
                System.out.print(" + ");
            } else if (i < 0) {
                System.out.print(" - ");
                i = -i;
            }

            if (i != 1) {
                System.out.print(i);
            }
            System.out.print("i");
        }

        if (r == 0 && i == 0) {
            System.out.print("0");
        }

        System.out.println();

        scanner.close();
    }
}
