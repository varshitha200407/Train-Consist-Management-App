import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular, Open, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + "(" + cargo + ")";
    }
}

public class TrainConsistMangementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Rectangular", "Coal"));      // allowed
        bogies.add(new GoodsBogie("Open", "Grain"));            // allowed
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));   // ❌ uncomment to test invalid

        // Safety validation using Stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Show bogies
        System.out.println("\nGoods Bogies:");
        System.out.println(bogies);
    }
}