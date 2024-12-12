// Question 5: Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class exception {
    public static void main(String[] args) {
        int age = 16; // Example age
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}