import java.util.Scanner;

public class WhileAndDoWhileLoop {

    public static void main(String[] args) {
        // int i = 1;

        // while (i<=5) 
        // {
        //     System.out.println(i);
        //     i++;
        // }

        Scanner r=new Scanner(System.in);
        String input;

        Scanner scanner;
        do {
            System.out.println("Enter a word (or 'exit' to quit): ");
            input = r.nextLine();
            System.out.println("You entered " + input);
        } while (!input.equals("exit"));

        System.out.println("Exiting the program...");
        r.close();
    }
    
}
