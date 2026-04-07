/*Write a program to count the number of odd digits in a given number.
Ex: if number n=4572, no of odd digits=2 */

import java.util.Scanner;
public class count {
    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int count=0;
        while(n>0){
            int singleDigit = n%10;
            if(singleDigit%2 !=0){
                count ++;
            }
            n=n/10;
        }
        System.out.println("No of odd digits:" +count);
        
    }
    
    
}

// for(int i=1; i<=4; i++){
//     for(int j=1; j<=i; j++){
//         System.out.println(i);
//     }
// }

for(int i=4; i>=1; i--){
    for(int j=1; j<=i; j--){
        System.out.println(j);
    }

}