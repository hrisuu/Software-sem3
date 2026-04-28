package week6;

/*Write a java to find the sum of any two 2x3 matrix: */
/*Example:
2 4 5  20 23 7  22 27 12
1 2 3  3  5  7  4  7  10 
*/

import java.util.Scanner;
public class ArrayPractice{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       //declare and construct the 2D array
       int[][] matrix1=new int[2][3];
       int[][] matrix2=new int[2][3];
       int[][] resultMatrix=new int[2][3];

       //enter the elements of 1st matrix
       System.out.println("Enter the elements of 1st matrix:");
       for(int i=0;i<2;i++){
          System.out.println("Enter the elements of row:"+(i+1));
          for(int j=0;j<3;j++){
               matrix1[i][j]=sc.nextInt();
          }
       }

       //enter the elements of 2nd matrix
       System.out.println("Enter the elements of 2nd matrix:");
       for(int i=0;i<2;i++){
          System.out.println("Enter the elements of row:"+(i+1));
          for(int j=0;j<3;j++){
               matrix2[i][j]=sc.nextInt();
          }
       }

       //find the sum of two matrix
      for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
               resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];

          }
       }

       //display the result matrix
       System.out.println("------result Matix-----");
       for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
               System.out.print(resultMatrix[i][j] + " ");
          }
          System.out.println();
       }


    } 
}
