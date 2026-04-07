// Programming Question: Grade Calculator (Using if-else if)

// Objective:
// To develop a Java program that uses if-else if statements to determine the grade of a student based on the marks percentage entered by the user.
// Marks Range	Grade
// 90 – 100	A
// 75 – 89	        B
// 60 – 74	        C
// 50 – 59	        D
// Below 50	Fail

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args){
    float marks;
    System.out.println("Enter the marks percentage: ");
    Scanner sc=new Scanner(System.in);
    marks=sc.nextFloat();
    String grade;
    if (marks>=90 && marks<=100){
      grade="A";
    }
    else if (marks>=75 && marks<=90){
      grade="B";
    }
    else if (marks>=60 && marks<=75){
      grade="C";
    }
    else if (marks>=50 && marks<=60){
      grade="D";
    }
    else{
      grade="NG";
    }
    System.out.println("Your grade is:" +grade);

  }
          
}