import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int n,r;
        System.out.println("Number Bhej");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        while(n>0);
        {
            r=n%10;
            System.out.println("Reverse Kardiya");
            n=n/10;
        }
    }
}
