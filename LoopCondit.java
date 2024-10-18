import java.util.Scanner;

public class LoopCondit {

    public static int gcdWhile(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int gcdDoWhile(int a, int b) {
        do {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        } while (a != b);
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        System.out.println("НСД (while): " + gcdWhile(a, b));
        System.out.println("НСД (do-while): " + gcdDoWhile(a, b));
    }
}