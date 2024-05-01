public class AlphabetTriangle {
    
    public static void main(String[] args)
    {
        int rows = 5; 
        
        for (int i=0; i<rows; i++) 
        {
            char currentChar = 'V'; 
            for (int j=0; j<=i; j++)
            {
                System.out.print(currentChar + " ");
                currentChar++; 
            }
            System.out.println(); 
        }
    }
}

