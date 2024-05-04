import java.util.Arrays;

public class Student {
    private String roll;
    private int[] marks;

    public Student(String roll, int[] marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public int fullmark() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Instantiate the class
        Student student1 = new Student("A101", new int[]{95, 85, 90, 88, 92});

        // Call the method to show full marks
        System.out.println("Full marks obtained by student with roll " + student1.roll + ": " + student1.fullmark());
    }
}
