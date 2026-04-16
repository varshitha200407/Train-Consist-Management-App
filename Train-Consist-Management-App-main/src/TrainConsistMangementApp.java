import java.util.Scanner;

public class TrainConsistMangementApp {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===\n");

        // 🔹 Array of Bogie IDs (unsorted)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // 🔹 Display available bogies
        System.out.print("Available Bogie IDs: ");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        System.out.println("\n");

        // 🔹 Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // 🔹 Linear Search Logic
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("\nBogie Found ✔ at index: " + i);
                break; // 🔹 Early termination
            }
        }

        // 🔹 Result output
        if (!found) {
            System.out.println("\nBogie Not Found ✖");
        }

        System.out.println("\nProgram completed successfully.");

        sc.close();
    }
}