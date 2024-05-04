import java.util.Scanner;

public class lab5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter dimensions for plate
        System.out.println("Enter dimensions for Plate:");
        System.out.print("Length: ");
        double plateLength = scanner.nextDouble();
        System.out.print("Width: ");
        double plateWidth = scanner.nextDouble();

        // Create a Plate object
        Plate plate = new Plate(plateLength, plateWidth);

        // Prompt the user to enter dimensions for box
        System.out.println("\nEnter dimensions for Box:");
        System.out.print("Length: ");
        double boxLength = scanner.nextDouble();
        System.out.print("Width: ");
        double boxWidth = scanner.nextDouble();
        System.out.print("Height: ");
        double boxHeight = scanner.nextDouble();

        // Create a Box object
        Box box = new Box(boxLength, boxWidth, boxHeight);

        // Prompt the user to enter dimensions for wood box
        System.out.println("\nEnter dimensions for Wood Box:");
        System.out.print("Length: ");
        double woodBoxLength = scanner.nextDouble();
        System.out.print("Width: ");
        double woodBoxWidth = scanner.nextDouble();
        System.out.print("Height: ");
        double woodBoxHeight = scanner.nextDouble();
        System.out.print("Thickness: ");
        double woodBoxThickness = scanner.nextDouble();

        // Create a WoodBox object
        WoodBox woodBox = new WoodBox(woodBoxLength, woodBoxWidth, woodBoxHeight, woodBoxThickness);

        // Display dimensions
        System.out.println("\nDimensions of Plate:");
        plate.display();
        System.out.println("\nDimensions of Box:");
        box.display();
        System.out.println("\nDimensions of Wood Box:");
        woodBox.display();

        scanner.close();
    }
}

class Plate {
    double length;
    double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class Box extends Plate {
    double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Height: " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thickness: " + thickness);
    }
}
