import java.util.*;

public class TrainConsistManagementApp {

    // UC20 Method
    public static boolean searchBogie(String[] bogies, String key) {
        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search Operations ===");

        try {
            String[] bogies1 = {};
            System.out.println("Searching in empty train...");
            searchBogie(bogies1, "BG101");

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        String[] bogies2 = {"BG101", "BG205", "BG309"};

        System.out.println("\nSearching BG205...");
        System.out.println("Found: " + searchBogie(bogies2, "BG205"));

        System.out.println("\nSearching BG999...");
        System.out.println("Found: " + searchBogie(bogies2, "BG999"));
    }
}