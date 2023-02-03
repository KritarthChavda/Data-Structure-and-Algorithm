import java.util.Scanner;
class matrix{
    public static void main(String[] args) {
        int row , column;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows");
        row = sc.nextInt();

        System.out.println("Enter the number of column");
        column = sc.nextInt();

        int matx1[][] = new int[row][column];
        int matx2[][] = new int[row][column];
        int ansMatx[][] = new int[row][column]; 

        System.out.println("Enter the elements of matx1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matx1[i][j] = sc.nextInt();
            }  
        }
        System.out.println("Enter the elements of matx2");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matx2[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ansMatx[i][j] = matx1[i][j] + matx2[i][j];
            }     
        }
        System.out.println("Sum of matrix");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < ansMatx.length; j++) {
                System.out.print(ansMatx[i][j] +" ");
            }
            System.out.println();  
        }

    }
}    