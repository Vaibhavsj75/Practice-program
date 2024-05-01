
public class FibonacciTriangle {
    public static void main(String[] args) {
        int n = 5; 
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}
