import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and columns for Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("Addition Result:");
            display(add(A, B));
            System.out.println("Subtraction Result:");
            display(subtract(A, B));
        } else {
            System.out.println("\nAddition/Subtraction not possible (Dimensions must match).");
        }

        if (c1 == r2) {
            System.out.println("Multiplication (A * B) Result:");
            display(multiply(A, B));
        } else {
            System.out.println("\nMultiplication not possible (Columns of A must equal Rows of B).");
        }
        
        sc.close();
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] add(int[][] m1, int[][] m2) {
        int r = m1.length;
        int c = m1[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }

    public static int[][] subtract(int[][] m1, int[][] m2) {
        int r = m1.length;
        int c = m1[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return res;
    }

    public static int