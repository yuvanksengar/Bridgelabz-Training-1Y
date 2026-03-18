import java.util.Random;
import java.util.Scanner;

public class MatrixAdvancedOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 for 2x2, 3 for 3x3): ");
        int n = sc.nextInt();

        double[][] matrix = createRandomMatrix(n, n);
        System.out.println("\nOriginal Matrix:");
        display(matrix);

        System.out.println("Transpose:");
        display(transpose(matrix));

        double det = (n == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
        System.out.println("Determinant: " + det);

        if (det != 0) {
            System.out.println("Inverse:");
            display((n == 2) ? inverse2x2(matrix) : inverse3x3(matrix));
        } else {
            System.out.println("Inverse does not exist (Determinant is 0).");
        }
        
        sc.close();
    }

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] m) {
        int r = m.length;
        int c = m[0].length;
        double[][] res = new double[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = m[i][j];
            }
        }
        return res;
    }

    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] res = new double[2][2];
        res[0][0] = m[1][1] / det;
        res[0][1] = -m[0][1] / det;
        res[1][0] = -m[1][0] / det;
        res[1][1] = m[0][0] / det;
        return res;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        double[][] adj = new double[3][3];

        adj[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        adj[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        adj[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]);

        adj[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        adj[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        adj[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);

        adj[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        adj[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);
        adj[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adj[i][j] /= det;
            }
        }
        return adj;
    }

    public static void display(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}