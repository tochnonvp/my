
import java.util.Scanner;

public class Calculation {
    public static String calc(String input) {
        String[] strings = input.replaceAll("\\s", "").split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        if (strings.length != 3) {
            throw new IllegalArgumentException("неверное число");
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[2]);
            if (a<1|a>10|b<1||b>10) {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка: введите только целые числа");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Ошибка: введите числа от 1 до 10");
        }
        char op = strings[1].charAt(0);

        if (a<1|a>10|b<1|b>10) {
            throw new IllegalArgumentException("Ошибка: введите только целые числа от 1 до 10");
        }
        int result;
        if (op == '+') {
            result = a + b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '/') {
            result = a / b;
        } else {
            throw new IllegalArgumentException("неверный знак ");
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию со знаками +,-,*,/, \nиспользуйте числа от 1 до 10 включительно");
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }
}
