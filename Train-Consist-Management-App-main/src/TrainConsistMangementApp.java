import java.util.ArrayList;
import java.util.List;

// 🔴 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔹 Goods Bogie Class
class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
        this.cargo = "EMPTY";
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    // 🔹 Cargo Assignment with Safety Check
    public void assignCargo(String cargoType) {

        try {
            System.out.println("Assigning " + cargoType + " to " + shape + " bogie...");

            // 🚨 Safety Rule
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe Assignment: Petroleum cannot be loaded into Rectangular bogie");
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully.");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Assignment process completed for " + shape + " bogie.\n");
        }
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "shape='" + shape + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

// 🔹 Main App
public class TrainConsistManagementAppUC15 {

    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment System ===\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        // 🔹 Create bogies
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");
        GoodsBogie b3 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);
        bogies.add(b3);

        // 🔹 Valid assignment
        b1.assignCargo("Coal");

        // 🔹 Safe assignment
        b2.assignCargo("Petroleum");

        // 🔹 Unsafe assignment (will trigger exception)
        b3.assignCargo("Petroleum");

        // 🔹 Continue program after failure
        System.out.println("Final Bogie Status:");

        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram completed safely without crash.");
    }
}