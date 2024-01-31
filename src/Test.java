import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите 1 операцию со знакаи +,-,*,/,\nиспользуйте числа от 1 до 10 включительно");
            String input = scanner.nextLine();
            System.out.println(Calc(input));
            scanner.close();
    }

    public static String Calc(String input) {
        String[] strings = input.replaceAll("\\s", "").split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        if (strings.length != 3) {
            throw new IllegalArgumentException("Не выполнены условия задачи");
        }
        int a;
        int b;
        int result = 0;

        try {
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[2]);
        }catch (NumberFormatException e){
           throw new  NumberFormatException("неверные данные");
        }

        if (a < 1 | a > 10 | b < 1 | b > 10) {
            throw new RuntimeException("используйте числа от 1 до 10 включительно");
        } else if (input.contains("+")) {
            result = a + b;
        } else if (input.contains("*")) {
            result = a * b;
        } else if (input.contains("-")) {
            result = a - b;
        } else if (input.contains("/")) {
            result = a / b;
        }else {
            throw new IllegalArgumentException("Неверный знак");
        }

        return String.valueOf(result);
    }
}












