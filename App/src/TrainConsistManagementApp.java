import java.util.Arrays;

public class TrainConsistManagementApp {

    // Method to sort bogie names
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}