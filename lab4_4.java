public class lab4_4 {
    public static void main(String[] args) {
        // Creating objects using both constructors
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "John Doe");

        // Displaying information of employees
        emp1.display();
        emp2.display();
    }
}

class Employee {
    int id;
    String name;

    // Default constructor
    public Employee() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display employee information
    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
