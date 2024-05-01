class A
{
    public void getValue()
    {
        int a = 10;
        System.out.println(a);
    }
}

class B extends A {
}

class C extends A {
}

class D extends B, C { // Java doesn't support multiple inheritance like C++
}

public class main
{
    public static void main(String[] args)
    {
        D obj = new D();
        obj.getValue();
    }

}



