import java.util.ArrayList;
import java.util.List;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Bogie Class with Validation
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

// 🔹 Main App
public class  TrainConsistMangementApp {

    public static void main(String[] args) {

        System.out.println("=== UC14: Invalid Capacity Exception Demo ===\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        // ✅ Valid bogies
        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 50));
            bogies.add(new PassengerBogie("First Class", 80));

            System.out.println("Valid bogies created successfully.");

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // ❌ Invalid bogies (testing exception)
        try {
            bogies.add(new PassengerBogie("Sleeper", -10));
        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            bogies.add(new PassengerBogie("AC", 0));
        } catch (InvalidCapacityException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println();

        // 🔹 Show final valid list
        System.out.println("Final Valid Bogies List:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram completed safely.");
    }
}