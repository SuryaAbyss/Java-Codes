import java.util.Scanner;

public class lab5_3 {
    public static void main(String[] args) {
        // Create objects for three persons
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        // Input details for each person
        System.out.println("Enter details of first person:");
        person1.input();

        System.out.println("\nEnter details of second person:");
        person2.input();

        System.out.println("\nEnter details of third person:");
        person3.input();

        // Display details of each person
        System.out.println("\nDetails of first person:");
        person1.disp();

        System.out.println("\nDetails of second person:");
        person2.disp();

        System.out.println("\nDetails of third person:");
        person3.disp();
    }
}

class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLong();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}
