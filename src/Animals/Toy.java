package Animals;

public class Toy
{
    private  String name;
    private double price;

    public Toy(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public Toy(Toy toy)
    {
        this.name = toy.name;
        this.price = toy.price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}
