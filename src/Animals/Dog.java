package Animals;

public class Dog extends Animal
{
    private int height;

    public Dog(String name, int age, int height)
    {
        super(name, age);
        this.height = height;
    }

    public void eat()
    {
        System.out.println("Dog eats");
    }

}
