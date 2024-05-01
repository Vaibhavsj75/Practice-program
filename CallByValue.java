public class CallByValue {

    public static void main(String[] args) 
    {
        int number= 10;

        System.out.println("Before calling number: "+ number);

        modifyNumber(number);

        System.out.println("After calling number: "+ number);
        
    }
    public static void modifyNumber(int num)
    {
        num = num + 5;
        System.out.println("Inside method: "+ num);
    }
    
}
