import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) 
    {
        int term,a=0,b=1,c;
        System.out.println("Enter a term");
        Scanner Scanner = new Scanner(System.in);
        term = Scanner.nextInt();
        for(int i=1; i<=term; i++);
        {
            System.err.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
