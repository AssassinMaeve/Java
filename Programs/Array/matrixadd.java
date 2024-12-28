import java.util.Scanner;

class MatrixAdd {
    public static void main(String[] args) {
        int row, col;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrices: ");
        row = sc.nextInt();

        System.out.println("Enter the number of columns for the matrices: ");
        col = sc.nextInt();

        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int matrixResult[][] = new int[row][col];

        // Input values for the first matrix
        System.out.println("Enter the values for the 1st matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input values for the second matrix
        System.out.println("Enter the values for the 2nd matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Adding matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixResult[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
