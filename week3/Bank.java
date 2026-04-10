// package week3;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float p,t,r,i;
        System.out.println("Enter Principal: ");
        p=sc.nextFloat(); //keyboard bata input lina

        System.out.println("Enter Time in year: ");
        t=sc.nextFloat();

        System.out.println("Enter rate of interest: ");
        r=sc.nextFloat();

        SimpleInterest var = new SimpleInterest();
        i= var.simpleInterest(p,t,r);
        System.out.println("Simple Interest= "+i);

        sc.close();
    }
    
    
}
