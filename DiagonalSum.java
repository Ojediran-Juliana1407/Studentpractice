// Create a java program that calculates the sum of the diagonals in a square matrix
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int diagonalSum = calculateDiagonalSum(matrix);
        System.out.println("The sum of the diagonals are: " + diagonalSum);
    }

    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
            sum += matrix[i][size - i - 1];
        }
        return sum;
    }
}