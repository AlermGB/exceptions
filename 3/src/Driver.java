
public class Driver {
    public static void main(String[] args)  {
        Contact contact = View.getUserInput();
        Model.saveContact(contact);
    }
}
