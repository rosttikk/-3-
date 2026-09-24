import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int number = sc.nextInt();
        System.out.print("Введіть число з плаваючою точкою: ");
        double decimal = sc.nextDouble();
        System.out.print("Введіть строку: ");
        String text = sc.next();
        System.out.print("Введіть логічне значення (true/false): ");
        boolean bool = sc.nextBoolean();
        System.out.printf("1. Ціле число: %d%n", number);
        System.out.printf("2. Число у 16-річній системі: %x%n", number);
        System.out.printf("3. Число з плаваючою точкою: %.2f%n", decimal);
        System.out.printf("4. Рядок: %s%n", text);
        String result1 = String.format("5. Число: %d", number);
        String result2 = String.format("6. Число у 8-річній системі: %o", number);
        String result3 = String.format("7. Дробове число: %.3f", decimal);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(String.format("8. Рядок: %10s", text));
        System.out.println(String.format("9. Рядок: %-10s", text));
        System.out.println(String.format("10. Логічне значення: %b", bool));
    }
}

