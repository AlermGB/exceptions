import java.time.LocalDate;

public class Contact{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private long phoneNumber;
    private  String gender;

    public Contact(String firstName, String lastName, LocalDate birthday, long phoneNumber, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    private boolean equals(Contact contact) {
        Contact t = contact;
        return this.firstName == t.firstName
                && this.lastName == t.lastName;
    }
}