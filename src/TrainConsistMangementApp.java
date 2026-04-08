import java.util.LinkedList;

public class TrainConsistMangementApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for ordered train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies in sequence
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index starts from 0)
        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Remove first and last bogies
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(train);

        // Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}