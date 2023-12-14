
import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {
        int passwordLength = 12; // Desired length of the password
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }

    public static String generatePassword(int length) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";

        String allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each category is included
        password.append(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
        password.append(lowercaseLetters.charAt(random.nextInt(lowercaseLetters.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        // Generate remaining characters
        for (int i = 4; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the generated password
        String shuffledPassword = shuffleString(password.toString());

        return shuffledPassword;
    }

    // Method to shuffle the characters in a string
    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        SecureRandom random = new SecureRandom();

        for (int i = characters.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = characters[index];
            characters[index] = characters[i];
            characters[i] = temp;
        }

        return new String(characters);
    }
}
