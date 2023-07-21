import java.util.Scanner;

public class HT1 {
    public static void main(String[] args) {
        System.out.println("Вы ввели: " + getFloat());
    }

    public static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean wrong = true;
        while (wrong) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                result = Float.parseFloat(input);
                wrong = false;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода. Повторите ");
            }
        }
        scanner.close();
        return result;
    }
}
