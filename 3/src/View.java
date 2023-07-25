import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class View {

    public static Contact getUserInput(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Введите имя, фамилию, дату рождения (дд.мм.гггг), номер телефон и пол через пробел.");
        System.out.println("Ввод:");
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] splitInput = Checker.checkUserInput(userInput).split(" ");
        String firstName = Checker.checkFirstName(splitInput[0]);
        String lastName = Checker.checkLastName(splitInput[1]);
        LocalDate birthday  = LocalDate.parse(Checker.checkBirthday(splitInput[2]), format);
        long phoneNumber = Long.parseLong(Checker.checkPhoneNumber(splitInput[3]));
        String gender = Checker.checkGender(splitInput[4]);
        return new Contact(firstName, lastName, birthday, phoneNumber, gender);
    }
}