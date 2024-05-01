abstract class animal
{
    animal()
    {
        System.out.println("All animals...!");
    }
    public abstract void sound();
}
class Dog extends animal
{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}
class Cat extends animal
{
    Cat()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Cat is meow");
    }
}
public class Abstract
{
    public static void main(String[] args) 
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();  c.sound();
    }
}