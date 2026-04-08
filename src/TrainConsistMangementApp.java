import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistMangementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern pTrain = Pattern.compile(trainPattern);
        Pattern pCargo = Pattern.compile(cargoPattern);

        // Match input
        Matcher mTrain = pTrain.matcher(trainId);
        Matcher mCargo = pCargo.matcher(cargoCode);

        // Validate
        if (mTrain.matches()) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (mCargo.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}