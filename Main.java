public class Main {
    public static void main(String[] args) {
        // Step 1: Create a User and test their birthday
        User john = new User("John", 1954, 12, 18); // Adjust date to match today's date for testing
        john.displayInfo();
        john.displayHappyBirthday(); // Ensure this is called for John
        System.out.println();

        // Step 2: Create an Admin and test their birthday
        Admin nicolas = new Admin("Nicolas", 1964, 12, 18); // Adjust date to match today's date for testing
        nicolas.displayInfo();
        nicolas.displayHappyBirthday(); // Ensure this is called for Nicolas
    }
}
