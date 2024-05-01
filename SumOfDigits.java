import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) 
    {  
        int n,a,sum=0;
        System.out.println("Send Number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        while(n>0);
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("Sum Of Digits");

    }
    
}
