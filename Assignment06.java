import java.util.Arrays;
import java.util.Scanner;
/*Write a program to rotate the matrix clockwise for three times */
public class Assignment06 {
    public static void rotateMatrix(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix.length-1;
        while(startRow< endRow){
            int temp = matrix[startRow+1][startCol];
            for(int i=startCol;i<=endCol;i++){
                matrix[startRow][i]=temp + matrix[startRow][i]-(temp = matrix[startRow][i]); 
            }
            startRow++;
            for(int i = startRow;i<=endRow;i++){
                matrix[i][endCol]=temp+matrix[i][endCol]-(temp=matrix[i][endCol]);
            }
            endCol--;
            for(int i = endCol;i>=startCol;i--){
                matrix[endRow][i]=temp+matrix[endRow][i]-(temp=matrix[endRow][i]);
            }
            endRow--;
            for(int i = endRow;i>=startRow;i--){
                matrix[i][startCol]=temp+matrix[i][startCol]-(temp=matrix[i][startCol]);
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the row size of the array: ");
        int row = sh.nextInt();
        System.out.println("Enter the col of the 2d matrix");
        int col = sh.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0 ;i<row;i++){
            for(int j =0;j<col;j++){
                matrix[i][j]=sh.nextInt();
            }
        }
        /*int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};*/
        //rotating 3 times 
        int n =3;
        while(n>0){
            rotateMatrix(matrix);
            n--;
        }
        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }
        sh.close();
    }
}
