package Farm;

public class Cat extends Animal
{
    private String color;
    private Toy toy;

    public Cat(String name, int age, String color)
    {
        super(name, age);
        this.color = color;
    }

    public void eat()
    {
        System.out.println("Cat eats");
    }

    public Toy getToy()     //defensive getter
    {
        return new Toy(toy.getName(), toy.getPrice());
    }

    @Override
    public void move()
    {
        System.out.println("Cat moves");
    }
}
