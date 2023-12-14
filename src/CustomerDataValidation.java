public class CustomerDataValidation {

    public static void main(String[] args) {
        // Example data
        String name = "John Doe";
        String address = "1234 Main St, Anytown";
        String phoneNumber = "123-456-7890";

        boolean isNameValid = validateName(name);
        boolean isAddressValid = validateAddress(address);
        boolean isPhoneNumberValid = validatePhoneNumber(phoneNumber);

        System.out.println("Is Name Valid: " + isNameValid);
        System.out.println("Is Address Valid: " + isAddressValid);
        System.out.println("Is Phone Number Valid: " + isPhoneNumberValid);
    }

    public static boolean validateName(String name) {
        // Name should contain only letters and be properly capitalized
        return name.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateAddress(String address) {
        // Address should not contain special characters
        return address.matches("[\\w\\s]+");
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        // Phone number should follow the format ###-###-####
        return phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }
}
