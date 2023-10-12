package ArrayTranspose;

import java.util.Scanner;

class ArrayTranspose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows (m): ");
        int m = s.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = s.nextInt();
        s.close();

        int A[][] = new int[m][n];
        int B[][] = new int[n][m]; 

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = s.nextInt();
            }
        }

        transpose(A, B);

        System.out.println("Original matrix:");
        printMatrix(A);

        System.out.println("Transposed matrix:");
        printMatrix(B);
    }

    static void transpose(int A[][], int B[][]) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[j][i] = A[i][j];
            }
        }
    }

    static void printMatrix(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
