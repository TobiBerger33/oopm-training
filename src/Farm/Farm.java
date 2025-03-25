package Farm;

public class Farm
{
    public Animal[] animals;
    private MovementBehavior[] moveableUnits;


    public Farm(int maxAnimals)
    {
        animals = new Animal[maxAnimals];
    }

    public void addAnimal(Animal animal)
    {
        for (int i = 0; i < animals.length; i++)
        {
            if (animals[i] == null)
            {
                animals[i] = animal;
                break;
            }
        }
    }

    public void animalsEat()
    {
        for (int i = 0; i < animals.length; i++)
        {
            if (animals[i] != null)
            {
                animals[i].eat();
            }
        }
    }

}
