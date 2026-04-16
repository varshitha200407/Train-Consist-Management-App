import java.util.Arrays;

public class  TrainConsistMangementApp{

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Using Arrays.sort() ===\n");

        // 🔹 Bogie type names (unsorted input)
        String[] bogieNames = {
                "Luxury",
                "General",
                "Sleeper",
                "AC Chair",
                "First Class"
        };

        System.out.println("Original Array: " + Arrays.toString(bogieNames));

        // 🔹 Built-in sorting (NO manual logic)
        Arrays.sort(bogieNames);

        // 🔹 Sorted output
        System.out.println("\nSorted Bogie Names (Alphabetical Order): " + Arrays.toString(bogieNames));

        System.out.println("\nProgram completed successfully.");
    }
}