public class AddressSimilarityFinder {

    public static void main(String[] args) {
        String address1 = "1234 Main St, Anytown";
        String address2 = "123 Main Street, Anytown";
        String address3 = "5678 Elm St, Othertown";
        String address4 = "1234 Main St, Othertown";

        // Compare address similarity
        boolean similar1and2 = areAddressesSimilar(address1, address2);
        boolean similar1and3 = areAddressesSimilar(address1, address3);
        boolean similar1and4 = areAddressesSimilar(address1, address4);

        System.out.println("Address 1 and Address 2 are similar: " + similar1and2);
        System.out.println("Address 1 and Address 3 are similar: " + similar1and3);
        System.out.println("Address 1 and Address 4 are similar: " + similar1and4);
    }

    public static boolean areAddressesSimilar(String address1, String address2) {
        // Calculate Levenshtein distance between addresses
        int distanceThreshold = 5; // Set a distance threshold to define similarity
        int distance = calculateLevenshteinDistance(address1.toLowerCase(), address2.toLowerCase());

        // Check if the distance is within the threshold for similarity
        return distance <= distanceThreshold;
    }

    // Method to calculate Levenshtein distance between two strings
    private static int calculateLevenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = (s1.charAt(i - 1) == s2.charAt(j - 1)) ?
                            dp[i - 1][j - 1] :
                            1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
