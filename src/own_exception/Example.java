package own_exception;

public class Example {
    public static void main(String[] args) {
        try {
            validateInput("abcde");
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " +e.getMessage());
        }
    }

    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input could not be null or empty");
        }
    }
}
