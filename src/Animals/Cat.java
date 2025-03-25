package Animals;

public class Cat extends Animal
{
    private String color;
    private Toy toy;

    public Cat(String name, int age, String color, Toy toy)
    {
        super(name, age);
        this.color = color;
        this.toy = toy;
    }

    public void eat()
    {
        System.out.println("Cat eats");
    }

    public Toy getToy()     //defensive getter
    {
        return new Toy(toy.getName(), toy.getPrice());
    }
}
