import java.util.Scanner;
import java.util.ArrayList;

public class ShanteriaJohnson_Driver {
    public static void main(String[] args) {
        //SHANTERIA JOHNSON 4/7/26
        // THIS PROGRAM WILL ALLOW THE STORE OWNER TO INPUT DATA FOR THEIR COFFEE SHOP INVENTORY,
        // THEY WILL BE ABLE TO ENTER THE VARIETY OF COFFEE AND FLAVORS AVAILABLE FOR THE DAY AND THEIR PRICES

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello shop owner!");

        //Coffee List
        ArrayList<String> coffeeTypes = new ArrayList<>();
        ArrayList<Double> coffeePrices = new ArrayList<>();

        //Flavor List
        ArrayList<String> flavors = new ArrayList<>();
        ArrayList<Double> flavorPrices = new ArrayList<>();

        //User input for different coffee types
        System.out.println("Enter a coffee type (type end to stop): ");
        String coffeeType = scanner.nextLine();

        while (!coffeeType.equalsIgnoreCase("end")) {
            coffeeTypes.add(coffeeType);
            System.out.println("Enter a coffee type (type end to stop): ");
            coffeeType = scanner.nextLine();
        }

        //User input for coffee prices
        for (int i = 0; i < coffeeTypes.size(); i++) {
            System.out.println("Enter price for " + coffeeTypes.get(i) + ": ");
            double price = scanner.nextDouble();
            coffeePrices.add(price);
        }
        scanner.nextLine();

        //User input for different coffee flavors
        System.out.println("Enter a flavor (type end to stop): ");
        String coffeeFlavor = scanner.nextLine();

        while (!coffeeFlavor.equalsIgnoreCase("end")) {
            flavors.add(coffeeFlavor);

            System.out.println("Enter a flavor (type end to stop): ");
            coffeeFlavor = scanner.nextLine();
        }

        //User input for coffee flavors
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println("Enter price for " + flavors.get(i) + ": ");
            double price = scanner.nextDouble();
            flavorPrices.add(price);
        }

        System.out.println("Welcome to Shanteria's Coffee Shop!");
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Choose a coffee type: ");

    }
}
