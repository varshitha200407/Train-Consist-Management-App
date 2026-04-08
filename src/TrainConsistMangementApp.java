import java.util.LinkedHashSet;

public class TrainConsistMangementApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for ordered & unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}