package university;

public class Person
{
    private String name;
    private int age;

    public Person (String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public Person setName (String name)
    {
        if (name != null)
        {
            this.name = name;
        }

        return this;
    }

    public String getName()
    {
        return name;
    }

    public Person setAge (int age)
    {
        if (age > 0)
        {
            this.age = age;
        }

        return this;
    }

    public int getAge()
    {
        return age;
    }


    public String getDetails ()
    {
        return String.format("Name: %s, Age: %d", getName(), getAge());
    }

}
