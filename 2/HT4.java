import java.util.Scanner;

public class HT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ibm866");
        String newString;      
        try {
            System.out.print("Введите строку: ");
            newString = scanner.nextLine();
            if (newString.isEmpty()) {
                throw new Exception("Введена пустая строка.Так нельзя)) ");
            } 
            else {
                System.out.println("Вы ввели: " + newString);
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        finally {
             scanner.close();
        }
    }
}
