/*Write a java program to display the multiplication table of given number.
ex: 4 x 1 = 4
    4 x 2 = 8
    .......
    4 x 10 = 40 */
import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();

        System.out.println();
        for(int i=1; i<=10; i++){
            System.out.println(n+ " X " + i + " = " + (n*i));
        }
        
        

    }
    
}
