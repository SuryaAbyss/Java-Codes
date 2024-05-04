import java.util.Random;

public class lab2_5 {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate and print random numbers 10 times
        for (int i = 0; i < 10; i++) {
            double randomNumber = random.nextDouble();
            System.out.print("Random number " + (i + 1) + ": " + randomNumber);
            if (randomNumber > 0.5) {
                System.out.println(" is greater than 0.5");
            } else {
                System.out.println(" is less than or equal to 0.5");
            }
        }
    }
}
