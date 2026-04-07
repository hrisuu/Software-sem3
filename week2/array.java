package week2;
/*Write aprogram to ask the gpa of 5 students thens store in array, display the average gpa. */

import java.util.Scanner;
public class array {
    public static void main (String[] args){
        float[] gpa = new float[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=4; i++){
            System.out.print("Enter the gpa of student " +(i+1)+ ": ");
            gpa[i]=sc.nextFloat();
        }
        float sum=0;
        for ( int i=0; i<=4; i++) {
            sum=sum+gpa[i];
        }
        // sum=gpa[0]+gpa[1]+gpa[3]+gpa[4];
        float avg=sum/5;
        System.out.println("Average gpa= "+avg);

    }
    
    
}
