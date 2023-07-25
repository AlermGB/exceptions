public class Checker {

    public static String checkUserInput(String input){
        if(input.split(" ").length != 5)
            throw new RuntimeException("Количество введенных элементов записи неверно!");
        return input;
    }
    public static String checkFirstName(String firstName){
        for (int i = 0; i < firstName.length(); i++) {
            if (Character.isDigit(firstName.charAt(i)))
                throw new RuntimeException("Имя содержит число!");
        }
        return firstName;
    }

    public static String checkLastName(String lastName){
        for (int i = 0; i < lastName.length(); i++) {
            if (Character.isDigit(lastName.charAt(i)))
                throw new RuntimeException("Фамилия содержит число!");
        }
        return lastName;
    }

    public static String checkBirthday(String birthday){
        String[] date = birthday.split("\\.");
        if((date.length != 3 || date[2].length() != 4) &&
                (isInteger(date[0]) && isInteger(date[1]) && isInteger(date[2])))
            throw new RuntimeException("Некорректная дата!");
        return birthday;
    }

    public static String checkPhoneNumber(String phoneNumber){
        try {
            Long.parseLong(phoneNumber);
        } catch(NumberFormatException e) {
            throw new RuntimeException("Проверьте правильность введенного номера телефона!");
        } catch(NullPointerException e) {
            throw new RuntimeException("Используйте при вводе телефона только цифы!");
        }
        return phoneNumber;
    }

    public static String checkGender(String gender) {
        boolean m = gender.equals("m");
        boolean f = gender.equals("f");
        if(!m && !f)
            throw new RuntimeException("Укажите правильный пол");
        return gender;
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
}