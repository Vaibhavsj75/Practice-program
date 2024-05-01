class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    public void makeSound()
    {
        System.out.println("Cat meow");
    }
}
public class FunctionOverriding{
    public static void main(String[] args) 
    {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}