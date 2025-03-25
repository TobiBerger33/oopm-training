package Farm;

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

    @Override
    public void move()
    {
        System.out.println("Dog moves");
    }
}
