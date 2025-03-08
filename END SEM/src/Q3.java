class MatrixMultiplicationThread extends Thread {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;
    private int row; // The row of the resultant matrix this thread will compute

    public MatrixMultiplicationThread(int[][] matrix1, int[][] matrix2, int[][] result, int row) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
        this.row = row;
    }

    @Override
    public void run() {
        int colsMatrix2 = matrix2[0].length;
        int colsMatrix1 = matrix1[0].length;

        for (int j = 0; j < colsMatrix2; j++) {
            result[row][j] = 0;
            for (int k = 0; k < colsMatrix1; k++) {
                result[row][j] += matrix1[row][k] * matrix2[k][j];
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }

        int[][] result = new int[matrix1.length][matrix2[0].length];
        int numberOfRows = matrix1.length;
        Thread[] threads = new Thread[numberOfRows];

        // Create and start threads
        for (int i = 0; i < numberOfRows; i++) {
            threads[i] = new MatrixMultiplicationThread(matrix1, matrix2, result, i);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfRows; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the result
        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}