class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

class Circle {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }
}

public class lab2_3 {
    public static void main(String[] args) {
        // Instantiate Rectangle
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());

        // Instantiate Square
        Square square = new Square(4);
        System.out.println("Area of Square: " + square.area());
        System.out.println("Perimeter of Square: " + square.perimeter());

        // Instantiate Circle
        Circle circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of Circle: " + circle.perimeter());
    }
}
