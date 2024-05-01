

public class CallByReference {

    public static void main(String[] args)
    {
        MyClass obj = new MyClass();

        System.out.println("Value of x before method call: "+ obj.x);

        changeValue(obj);

        System.out.println("Value of x after method call: "+ obj.x);
    }
    public static void changeValue(MyClass obj) 
    {
        obj.x = 10;
    }
}
        
    class MyClass {
        int x = 5;
    }
    
