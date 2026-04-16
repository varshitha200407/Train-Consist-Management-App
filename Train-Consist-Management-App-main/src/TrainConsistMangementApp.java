import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistMangementApp {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===\n");

        // 🔹 Bogie IDs (can be unsorted input)
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        System.out.println("Original Array: " + Arrays.toString(bogieIds));

        // 🔹 Step 1: Sort array (required for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Array:   " + Arrays.toString(bogieIds));

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔹 Step 2: Binary Search logic
        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compareResult = key.compareTo(bogieIds[mid]);

            if (compareResult == 0) {
                System.out.println("\nBogie Found ✔ at index: " + mid);
                found = true;
                break;
            } else if (compareResult > 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        // 🔹 Result handling
        if (!found) {
            System.out.println("\nBogie Not Found ✖");
        }

        System.out.println("\nProgram completed successfully.");

        sc.close();
    }
}