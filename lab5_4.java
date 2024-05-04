import java.util.Scanner;

public class lab5_4 {
    public static void main(String[] args) {
        // Create a Kiitian object
        Kiitian kiitian = new Kiitian();
        
        // Input details for Kiitian
        kiitian.getInput();
        
        // Display details of Kiitian
        kiitian.display();
    }
}

abstract class Student {
    int rollNo;
    long regNo;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Registration No: ");
        regNo = scanner.nextLong();
    }

    public abstract void course();
}

class Kiitian extends Student {
    @Override
    public void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
        course();
    }
}
