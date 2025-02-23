import java.util.Scanner;

class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, price = 0;
        boolean valid;

        // Get gallons in the tank.
        valid = false;
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                valid = true;
            } else {
                String trash = in.next();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
            in.nextLine();
        } while (!valid);

        // Get fuel efficiency in miles per gallon.
        valid = false;
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                valid = true;
            } else {
                String trash = in.next();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
            in.nextLine();
        } while (!valid);

        // Get price of gas per gallon.
        valid = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                valid = true;
            } else {
                String trash = in.next();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
            in.nextLine();
        } while (!valid);

        // Calculate and display results.
        double costFor100Miles = (100 / mpg) * price;
        double fullTankDistance = gallons * mpg;
        System.out.println("Cost to drive 100 miles: $" + costFor100Miles);
        System.out.println("Distance with a full tank: " + fullTankDistance + " miles");
    }
}
