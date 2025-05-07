import java.util.Scanner;


class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class password{
    private static final String VALID_USERNAME = "akhila";
    private static final String VALID_PASSWORD = "akhila@123";

    public static void authenticate(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        if (!username.equals(VALID_USERNAME)) {
            throw new InvalidUsernameException("Error: Username is incorrect.");
        }

        if (!password.equals(VALID_PASSWORD)) {
            throw new InvalidPasswordException("Error: Password is incorrect.");
        }

        System.out.println("Login successful! Welcome " + username);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            authenticate(username, password);

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Authentication process ended.");
        }
    }
}

