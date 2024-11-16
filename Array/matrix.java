import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        int n,m;
        

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n=sc.nextInt();

        System.out.println("Enter the number of column: ");
        m=sc.nextInt();
        int matrix[][]= new int[n][m];

        System.out.println("Enter the values: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The Values Entered: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}
