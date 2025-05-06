package Files;

public class Person
{
    public String name;
    public int age;
    public int id;


    public Person(String name, int age, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getId()
    {
        return id;
    }


    public String toString()
    {
        return age + "," + name + "," + id;
    }
}
