import java.util.Scanner;

public class ConditOperat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Результат: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Результат: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Помилка: Ділення на нуль!");
                }
                break;
            default:
                System.out.println("Невірний оператор!");
                break;
        }

        scanner.close();
    }
}
