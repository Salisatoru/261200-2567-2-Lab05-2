import java.time.LocalDate;

public class Admin extends User {
    // Default constructor
    public Admin() {
        super();
    }

    // Parameterized constructor
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    // Overriding displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin");
    }

    // Overloaded displayInfo method
    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + getName());
            System.out.println("Date of Birth: " + getDob());
            System.out.println("User type: admin");
            System.out.println("Today's Date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }
    }

    // Overriding displayHappyBirthday
    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) {
            int currentYear = LocalDate.now().getYear();
            int age = currentYear - getDob().getYear();
            System.out.println("Happy birthday " + getName() + "! You're " + age + "!");
        }
    }
}
