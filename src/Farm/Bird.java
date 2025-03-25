package Farm;

public class Bird extends Animal
{
    private double weight;

    public Bird(String name, int age, double weight)
    {
        super(name, age);
        this.weight = weight;
    }

    public void eat()
    {
        System.out.println("Bird eats");
    }

    public void makeSound()
    {
        System.out.println("Bird sound");
    }

    @Override
    public void move()
    {
        super.move();
    }
}
