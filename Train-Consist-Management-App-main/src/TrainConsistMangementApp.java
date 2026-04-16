import java.util.Scanner;

public class  TrainConsistMangementApp {

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search Operations ===\n");

        // 🔹 Bogie IDs collection (you can make it empty to test exception)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔴 Step 1: Fail-fast validation
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Search operation cannot be performed.");
        }

        // 🔹 Step 2: Search logic (Linear Search)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // 🔹 Step 3: Output result
        if (found) {
            System.out.println("\nBogie Found ✔");
        } else {
            System.out.println("\nBogie Not Found ✖");
        }

        System.out.println("\nProgram completed successfully.");

        sc.close();
    }
}