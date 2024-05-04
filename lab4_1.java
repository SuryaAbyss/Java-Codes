public class lab4_1 {
    static int objectNumber = 0;

    public lab4_1() {
        objectNumber++;
    }

    public static void main(String[] args) {
        // Creating multiple objects of the class
        lab4_1 obj1 = new lab4_1();
        lab4_1 obj2 = new lab4_1();
        lab4_1 obj3 = new lab4_1();
        lab4_1 obj4 = new lab4_1();

        // Printing the object number
        System.out.println("Number of objects created: " + lab4_1.objectNumber);
    }
}
