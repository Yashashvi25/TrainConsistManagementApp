import java.util.regex.Pattern;

// Main class
public class TrainConsistManagementApp {

    // Regex patterns
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    // Validate Train ID
    public static boolean isValidTrainId(String trainId) {
        return Pattern.matches(TRAIN_ID_REGEX, trainId);
    }

    // Validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        return Pattern.matches(CARGO_CODE_REGEX, cargoCode);
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Validate Train ID
        if (isValidTrainId(trainId)) {
            System.out.println("Valid Train ID: " + trainId);
        } else {
            System.out.println("Invalid Train ID: " + trainId);
        }

        // Validate Cargo Code
        if (isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }
    }
}