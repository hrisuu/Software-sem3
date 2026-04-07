package week2;
//write a program to store your max expenses in 10 days. 

import java.util.Scanner;

public class expenses {
    public static void main(String[] args) {
        double[] expense = new double[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Enter your today's expense Day " + (i + 1) + ": ");
            expense[i] = sc.nextDouble();

        }
        double max = expense[0];
        for (int i = 1; i <= 9; i++) {
            if (expense[i] > max) {
                max = expense[i];
            }
        }

        System.out.println("\n Your Expense is: " + max);

        //sorting
        for (int i = 0; i <= 9; i++) {
            for (int j = i + 1; i <= 9; j++) {
                if (expense[i] > expense[j]) {
                    double temp = expense[i];
                    expense[i] = expense[j];
                    expense[j] = temp;
                }
            }
        }
        // display the sorted array
        System.out.println("Expenses in ascending order: ");
        for (int i = 0; i <= 9; i++) {
            System.out.println(expense[i] + ",");
        }

    }

}
