import java.util.Arrays;

public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG309";

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}