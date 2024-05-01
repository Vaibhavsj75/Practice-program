import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) 
    {
        int n,c,s=0,r;
        System.out.println("Enter any Number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        c=n;
        while (n>0) 
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }

        if(c==s)
        System.out.println("Palindrome number");
        else
        System.out.println("Not palindrome number");
    }

}
