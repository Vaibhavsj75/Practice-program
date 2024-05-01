import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        
        int n,arm=0,rem,c;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        c=n;

        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }

        if (c==arm) 
        {
            System.out.println("Armstrong Number"); 
        } 
        else
        {
            System.out.println("Not Aremstrong NUmber");
        }

    }
    
}
