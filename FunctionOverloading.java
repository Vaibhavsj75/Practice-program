public class FunctionOverloading {

    // Method with a single int parameter
    public void myMethod(int x) {
        System.out.println("Method with int parameter: " + x);
    }

    // Method with a single double parameter
    public void myMethod(double y) {
        System.out.println("Method with double parameter: " + y);
    }

    // Method with two int parameters
    public void myMethod(int a, int b) {
        System.out.println("Method with two int parameters: " + a + ", " + b);
    }

    // Method with a String parameter
    public void myMethod(String str) {
        System.out.println("Method with String parameter: " + str);
    }

    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();

        // Invoking methods with different parameter types
        obj.myMethod(10);
        obj.myMethod(3.14);
        obj.myMethod(20, 30);
        obj.myMethod("Hello");
    }
}

