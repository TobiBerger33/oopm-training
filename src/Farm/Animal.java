package Farm;

public abstract class Animal implements MovementBehavior
{
    private String name;
    private int age;


    public Animal (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    protected void makeSound()
    {
        System.out.println("Animal sound");
    }

    protected double CalculateB()
    {
        return 0.4;
    }

    public void move()
    {
        System.out.println("Animal move");
    }
}
