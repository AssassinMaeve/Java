import java.util.Scanner;
public class matrixdisplayEg {
    
    int mat[][];

    matrixdisplayEg(int row, int col){
        mat= new int[row][col];
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
            mat[i][j]=sc.nextInt();
        }
    }
    sc.close();
}

    void display(){
        System.out.println("The elements in the matrix is: ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}


class matrixdisplay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();

        System.out.println("Enter the number of cols: ");
        int cols=sc.nextInt();

        matrixdisplayEg m = new matrixdisplayEg(row, cols);
        m.accept();
        m.display();
        
        sc.close();
    }
    
}
