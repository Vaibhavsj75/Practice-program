public class CountCharactersOccurance {

    public static void main(String[] args) {
        
        String s="Java Programming Java oops";

        int totalcount = s.length();

        int totalcount_afterRemove = s.replace("J"," ").length();

        int count = totalcount-totalcount_afterRemove;

        System.out.println("Number Occurance of J is:"+count);
    }
    
}
