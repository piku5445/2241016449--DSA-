
public class Q2 {

    public static void main(String[] args) {
        // Define two matrices
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
        
        // Check if matrices can be multiplied
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }

        // Perform matrix multiplication
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        // Print the result
        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int colsMatrix2 = matrix2[0].length;
        
        int[][] result = new int[rowsMatrix1][colsMatrix2];

        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                for (int k = 0; k < colsMatrix1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
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
