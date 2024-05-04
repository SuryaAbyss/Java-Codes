import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();

        Cube cube = new Cube(side);
        cube.display();

        scanner.close();
    }
}

class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public void display() {
        System.out.println("\nCube Details:");
        System.out.println("Side Length: " + side);

        Square square = new Square();
        System.out.println("Area of Cube: " + square.ar());
        System.out.println("Perimeter of Cube: " + square.pr());
        System.out.println("Volume of Cube: " + vol());
    }

    public double vol() {
        return side * side * side;
    }

    class Square {
        public double ar() {
            return side * side;
        }

        public double pr() {
            return 4 * side;
        }
    }
}
