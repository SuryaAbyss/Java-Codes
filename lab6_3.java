import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter the employee id and employee name: ");
        int empid = scanner.nextInt();
        String ename = scanner.next();

        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        // Create sales object
        sales emp = new sales(empid, ename, basic);

        // Calculate total earning and travelling allowance
        double totalEarnings = emp.earnings();
        double ta = emp.tallowance();

        // Display results
        System.out.println("\nThe emp id of the employee is " + empid);
        System.out.println("The total earning is " + (totalEarnings + ta));

        scanner.close();
    }

    static class employee {
        protected int empid;
        private String ename;
        double basic;

        public employee(int empid, String ename, double basic) {
            this.empid = empid;
            this.ename = ename;
            this.basic = basic;
        }

        public double earnings() {
            double da = 0.8 * basic;
            double hra = 0.15 * basic;
            return basic + da + hra;
        }
    }

    static class sales extends employee {
        public sales(int empid, String ename, double basic) {
            super(empid, ename, basic);
        }

        public double tallowance() {
            return 0.05 * earnings();
        }
    }
}
