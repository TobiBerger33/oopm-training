package Exeptions;

public class Customer
{
    private String email;
    private Owner owner;

    public Customer(String name, int age, int id)
    {
    }


    public void setEmail (String mail)
    {
        if(!mail.contains("@"))
            throw new IllegalArgumentException("Email is not valid: email contains no @");
        else
            email = mail;

    }

    public void setOwner (Owner owner)
    {
        if (owner == null)
            throw new IllegalArgumentException("Owner is null");
        else
            this.owner = owner;
    }
}
