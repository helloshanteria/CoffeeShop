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

        //User input for coffee types
        System.out.println("Enter a coffee type (type end to stop): ");
        String coffeeType = scanner.nextLine();

        while (!coffeeType.equalsIgnoreCase("end")) {
            coffeeTypes.add(coffeeType);
            System.out.println("Enter a coffee type (type end to stop): ");
            coffeeType = scanner.nextLine();
        }

        //Coffee type prices
        for (int i = 0; i < coffeeTypes.size(); i++) {
            System.out.println("Enter price for " + coffeeTypes.get(i) + ": ");
            double price = scanner.nextDouble();
            coffeePrices.add(price);
        }
        scanner.nextLine();

        //User input for coffee flavors
        System.out.println("Enter a flavor (type end to stop): ");
        String coffeeFlavor = scanner.nextLine();

        while (!coffeeFlavor.equalsIgnoreCase("end")) {
            flavors.add(coffeeFlavor);

            System.out.println("Enter a flavor (type end to stop): ");
            coffeeFlavor = scanner.nextLine();
        }

        //Coffee flavors prices
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println("Enter price for " + flavors.get(i) + ": ");
            double price = scanner.nextDouble();
            flavorPrices.add(price);
        }
        scanner.nextLine();

        //Part 1: Welcome Customer & Add Items to Shopping Cart
        System.out.println("Welcome to Shanteria's Coffee Shop!");
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();

        //Coffee Menu
        ArrayList<Coffee> coffee1 = new ArrayList<>();

        while (true) {
            System.out.println("Choose a coffee type (or type 0 to end): ");
            System.out.println("1. " + coffeeTypes.get(0));
            System.out.println("2. " + coffeeTypes.get(1));
            System.out.println("3. " + coffeeTypes.get(2));
            System.out.println("4. " + coffeeTypes.get(3));
            System.out.println("0. End");

            int choice = scanner.nextInt();

            if (choice == 1) {
                Coffee c1 = new Coffee(coffeeTypes.get(0), coffeePrices.get(0));
                coffee1.add(c1);
            } else if (choice == 2) {
                Coffee c2 = new Coffee(coffeeTypes.get(1), coffeePrices.get(1));
                coffee1.add(c2);
            } else if (choice == 3) {
                Coffee c3 = new Coffee(coffeeTypes.get(2), coffeePrices.get(2));
                coffee1.add(c3);
            } else if (choice == 4) {
                Coffee c4 = new Coffee(coffeeTypes.get(3), coffeePrices.get(3));
                coffee1.add(c4);
            } else {
                break;
            }
        }

        //Flavor Menu
        ArrayList<Flavor> flavor1 = new ArrayList<>();

        while (true) {
            System.out.println("Choose a flavor (or type 0 to end): ");
            System.out.println("1. " + flavors.get(0));
            System.out.println("2. " + flavors.get(1));
            System.out.println("3. " + flavors.get(2));
            System.out.println("0. End");

            int choice = scanner.nextInt();
        //For Customer Choices
            if (choice == 1) {
                Flavor flavor2 = new Flavor(flavors.get(0), flavorPrices.get(0));
                flavor1.add(flavor2);
            } else if (choice == 2) {
                Flavor flavor3 = new Flavor(flavors.get(1), flavorPrices.get(1));
                flavor1.add(flavor3);
            } else if (choice == 3) {
                Flavor flavor4 = new Flavor(flavors.get(2), flavorPrices.get(2));
                flavor1.add(flavor4);
            } else {
                break;
            }
        //Shopping Cart & Total
            double total = 0;

            for (int i = 0; i < coffee1.size(); i++) {
                total += coffee1.get(i).getPrice();
            }

            for (int i = 0; i < flavor1.size(); i++) {
                total += flavor1.get(i).getFPrice();
            }

            System.out.println(customerName + ", your total balance is $" + total);

            scanner.close();
        }
    }
}
