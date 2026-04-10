// package week3;

public class calculator {

    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println("Sum of two numbers: " + cal.sum(3, 4));
        System.out.println("Sum of two numbers:" + cal.sum(3, 4, 17));
        System.out.println("Sum of two numbers:" + cal.sum(3.0f, 10.0f));
    }

    public int sum(int a, int b) {
        return a + b;
    }

   public int sum(int a, int b, int c){
       return a+b+c;
   }

    public float sum(float a, float b) {
        return a + b;
    }
}
