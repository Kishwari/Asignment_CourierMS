public class AddressFormatting {

    public static void main(String[] args) {
        // Example address components
        String street = "1234 main street";
        String city = "anytown";
        String state = "NY";
        String zipCode = "12345";

        String formattedAddress = formatAddress(street, city, state, zipCode);
        System.out.println("Formatted Address:\n" + formattedAddress);
    }

    public static String formatAddress(String street, String city, String state, String zipCode) {
        // Capitalize the first letter of each word in street and city
        street = capitalizeEachWord(street);
        city = capitalizeEachWord(city);

        // Format the zip code correctly (5 digits)
        if (zipCode.length() > 5) {
            // Trim any leading or trailing spaces
            zipCode = zipCode.trim();
            // Take the first 5 characters if the zip code is longer
            zipCode = zipCode.substring(0, 5);
        } else if (zipCode.length() < 5) {
            // Pad the zip code with leading zeroes if it's shorter than 5 digits
            zipCode = String.format("%05d", Integer.parseInt(zipCode));
        }

        // Construct the formatted address
        String formattedAddress = street + ", " + city + ", " + state + " " + zipCode;

        return formattedAddress;
    }

    // Method to capitalize the first letter of each word in a string
    private static String capitalizeEachWord(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            }

            result.append(c);
        }

        return result.toString();
    }
}
