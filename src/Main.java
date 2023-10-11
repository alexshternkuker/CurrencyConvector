import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Конвертер валют");
        System.out.println("Сколько у вас рублей");

        double a = new Scanner(System.in).nextDouble();

        System.out.println("введите курс евро");
        double euro = new Scanner(System.in).nextDouble();

        System.out.println("введите курс долл");
        double doll = new Scanner(System.in).nextDouble();

        System.out.println(a + " рублей это " + a * (1 / doll) + " долларов");
        System.out.println(a + " рублей это " + a * (1 / euro) + " евро");
        // чтобы оставить 2 символа после точки нужен параметр if
    }
}