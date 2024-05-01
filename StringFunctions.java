public class StringFunctions {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. Length of specific string 
        int length = str.length();
        System.out.println("Length of string: "+ length);

        // 2. Character at specific index
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: "+ charAtIndex);

        // 3. Substring
        String subString = str.substring(7);
        System.out.println("Substring from index 7: "+ subString);

        // 4. Concatenation
        String newStr = str.concat("How are you");
        System.out.println("Concatenated strng: "+ newStr);

        // 5. Index of a character
        int indexOfW = str.indexOf("W");
        System.out.println("index of W "+ indexOfW);

        // 6. Index of a character starting from a specific index
        int indexOfWFromIndex3 = str.indexOf("W", 3);
        System.out.println("Index of w from index 3: "+ indexOfW);

        // 7. Check if a string contains a substring
        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello?': "+ containsHello);

        // 8. Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercae string: "+ upperCaseStr);

        // 9. Convert to lowecase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: "+ lowerCaseStr);

        // 10. Replace character
        String replacedStr = str.replace('o', 'x');
        System.out.println("String after replacing 'o' with 'x': "+ replacedStr);

        // 11. Split string
        String[] splitStr = str.split(",");
        for(String s : splitStr);{
            System.out.println();
        }

        // 12. Trim leading and trailing whitespaces
        String strWithWhitespace = "   Trim me   ";
        String trimmedStr = strWithWhitespace.trim();
        System.out.println("String after trimming white space: '" + trimmedStr + "'");

    }
    
}
