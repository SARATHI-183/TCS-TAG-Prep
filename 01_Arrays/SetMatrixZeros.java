import java.util.*;

// Given an m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeroes(matrix, rows, cols);

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix, int rows, int cols) {

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check first row
        for(int j = 0; j < cols; j++) {
            if(matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check first column
        for(int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark rows and columns
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Update inner matrix
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Update first row
        if(firstRowZero) {
            for(int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Update first column
        if(firstColZero) {
            for(int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}