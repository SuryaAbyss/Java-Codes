import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        // Create a Head object
        Head head = new Head();
        
        // Input details for the head
        head.getDetails();
        head.getDeptDetails();
        
        // Display details of the head
        head.display();
    }
}

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    @Override
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Employee Name: ");
        empName = scanner.nextLine();
    }

    @Override
    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department ID: ");
        deptId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Department Name: ");
        deptName = scanner.nextLine();
    }

    public void display() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}
