import java.util.*;

public class TwoDArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // number to search
        int x = sc.nextInt();

        // search in matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + "," + j + ")");
                }

            }
        }

        sc.close();
    }
}
