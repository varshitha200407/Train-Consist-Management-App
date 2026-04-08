import java.util.HashMap;
import java.util.Map;

public class TrainConsistMangementApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie → capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}