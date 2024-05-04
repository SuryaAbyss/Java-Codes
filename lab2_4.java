import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the electricity unit charge
        System.out.print("Enter the electricity unit charge: ");
        double unitCharge = scanner.nextDouble();

        // Calculate the total bill
        double totalBill = calculateBill(unitCharge);

        // Add surcharge (20%)
        double surcharge = totalBill * 0.20;
        totalBill += surcharge;

        // Display the total bill
        System.out.println("Total electricity bill: Rs. " + totalBill);

        // Close the scanner
        scanner.close();
    }

    public static double calculateBill(double unitCharge) {
        double totalBill = 0;

        if (unitCharge <= 50) {
            totalBill = unitCharge * 0.50;
        } else if (unitCharge <= 150) {
            totalBill = 50 * 0.50 + (unitCharge - 50) * 0.75;
        } else if (unitCharge <= 250) {
            totalBill = 50 * 0.50 + 100 * 0.75 + (unitCharge - 150) * 1.20;
        } else {
            totalBill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unitCharge - 250) * 1.50;
        }

        return totalBill;
    }
}
