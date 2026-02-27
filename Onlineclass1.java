public class Onlineclass1 {

    public static void main(String[] args) {

        // Matrix A
        int[][] A = { { 1, 2, 3 }, { 5, 6, 7 } };

        // Matrix B
        int[][] B = { { 9, 7, 4 }, { 7, 1, 2 } };

        // Result matrix (same size as A and B)
        int[][] C = new int[2][3];

        // Adding matrices
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                C[r][c] = A[r][c] + B[r][c];
            }
        }

        // Printing result matrix
        System.out.println("Result of A + B:");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("   " + C[r][c]);
            }
            System.out.println();
        }
    }
}
