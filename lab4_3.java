import java.util.Scanner;

public class lab4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your choice:");
        System.out.println("1. Calculate area of square");
        System.out.println("2. Calculate area of rectangle");
        System.out.println("3. Calculate volume of cuboid");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of square: " + calc(side));
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                System.out.println("Area of rectangle: " + calc(length, breadth));
                break;
            case 3:
                System.out.print("Enter the length of the cuboid: ");
                double cuboidLength = scanner.nextDouble();
                System.out.print("Enter the breadth of the cuboid: ");
                double cuboidBreadth = scanner.nextDouble();
                System.out.print("Enter the height of the cuboid: ");
                double cuboidHeight = scanner.nextDouble();
                System.out.println("Volume of cuboid: " + calc(cuboidLength, cuboidBreadth, cuboidHeight));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double calc(double side) {
        return side * side; // Area of square
    }

    public static double calc(double length, double breadth) {
        return length * breadth; // Area of rectangle
    }

    public static double calc(double length, double breadth, double height) {
        return length * breadth * height; // Volume of cuboid
    }
}
