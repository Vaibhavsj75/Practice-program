import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrime(number);

        if(isPrime) {
            System.out.println("is a prime number");
        }
        else{
            System.out.println("is not a prime number");
        }
    } 

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) 
        {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}  