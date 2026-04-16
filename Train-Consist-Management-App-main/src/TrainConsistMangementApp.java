import java.util.Arrays;

public class TrainConsistMangementApp{

    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort Passenger Bogie Capacities ===\n");

        // 🔹 Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Array: " + Arrays.toString(capacities));

        // 🔹 Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 🔄 Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // 🔹 Optimization: Stop if already sorted
            if (!swapped) {
                break;
            }
        }

        // 🔹 Output sorted array
        System.out.println("\nSorted Array (Ascending Order): " + Arrays.toString(capacities));

        System.out.println("\nProgram completed successfully.");
    }
}