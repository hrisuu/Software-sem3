package week3;
// a program with a method to find the smallest number from two numbers.
public class  calculation{
    public static void main(String[] args){
        int x=45;
        int y=23;
        //calling the method
        calculation var= new calculation();
        int result= var.smallestNumber(x, y);
        System.out.println("Smallest Number= "+result);

    }
    //method defination
    public int smallestNumber(int a, int b){ //int a, int b are parameters.
        int min;
        min=a<b?a:b;
        System.out.println("Calculation Completed.");
        return min;
    }
}
