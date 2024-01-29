import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите операцию со знаками +,-,*,/, \nиспользуйте числа от 1 до 10 включительно");
            String input = scanner.next();
            String[] strings = input.split("\\W");
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);

            if (b>= 11 | a >= 11) {
                System.out.println("не выполнено усовение задачи");
            } else if (input.contains("+")) {
                System.out.println(a + b);
            } else if (input.contains("*")) {
                System.out.println(a * b);
            } else if (input.contains("-")) {
                System.out.println(a - b);
            } else if (input.contains("/")) {
                System.out.println(a / b);
            } else {
                System.out.println("не выполнено условие задачи");
            }

        } catch (Exception e) {
            System.out.println("не выполнено условие задачи");//один два
        }

        System.out.println(",,,,");
    }
}