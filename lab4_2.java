public class lab4_2 {
    public static void main(String[] args) {
        // Define and initialize the jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };

        // Print length and sum of each row in the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < jaggedArray[i].length; j++) {
                sum += jaggedArray[i][j];
            }
            System.out.println("Length of row " + i + ": " + jaggedArray[i].length);
            System.out.println("Sum of row " + i + ": " + sum);
        }
    }
}
