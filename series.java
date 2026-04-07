/*import java.util.Scanner;     //using while loop
public class series {
    public static void main(String[] args) {
        int n=50;
        while(n>=5){
            if(n==5){
                System.out.println(n);
            }
            else{
                System.out.print(n+", ");
            }   
            n=n-5;
        }
        
    }   
}
*/


/*Do loop */
import java.util.Scanner;
public class series{
    public static void main(String[] args){
        int n=50;
        while(n>=5){
            System.out.println(n+", ");
            n=n-5;
        }
        
        int x=1;
        int count=1;
        do{
            System.out.println(x);
            x=x*10+1;
            count++;

        }while(count<=4);
        

    }
}