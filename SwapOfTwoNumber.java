import java.util.Scanner;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        
        int a, b, temp;
        System.out.println("Enter any two numbers:");
        Scanner op = new Scanner(System.in);
        a = op.nextInt();
        b = op.nextInt();
        
        System.out.println("Before Swapping: " + a + " " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping: " + a + " " + b);
    }
}