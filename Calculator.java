// Write a menu driven to do the multiple operation on the basis of value choose ny user. 
// Press 1: Add, Press 2: Subtract, Press 3:Multiply, Press 4: Fivide and Press 0: Exit.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter your choice---");
        System.out.println("Press 1: Add");
        System.out.println("Press 3: Multiply");
        System.out.println("Press 4: Divide");
        System.out.println("Press 5: Exit");

        int choice = sc.nextInt();
        int a=0, b=0;
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
            System.out.print("\nEnter number");
            a = sc.nextInt();

            System.out.print("\nEnter another number");
            b = sc.nextInt();

        }

        switch (choice) {
            case 1:
                int s = a + b;
                System.out.println("Sum=" + s);
                break;
            case 2:
                int d = a - b;
                System.out.println("Difference= " + d);
                break;
            case 3:
                int c = a / b;
                System.out.println("Division= " + c);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid input!");

        }

    }

}
