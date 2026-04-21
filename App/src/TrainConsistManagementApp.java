import java.util.Arrays;

public class TrainConsistManagementApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 80, 40};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // Sort using Bubble Sort
        bubbleSort(capacities);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(capacities));
    }
}