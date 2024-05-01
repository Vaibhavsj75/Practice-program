abstract class Shape
{
    // Abstract method
    public abstract double area();
}

class Circle extends Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return Math.PI * radius * radius;
    }
} 

class Rectangle extends Shape
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double area()
    {
        return width * height;
    }
}
public class PureVertualFunction{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape Rectangle = new Rectangle(4, 6);
        System.out.println("circle area: "+ circle.area());
        System.out.println("Rectangle area: "+ Rectangle.area());
    }
}