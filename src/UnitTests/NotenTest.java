package UnitTests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

class NotenTest
{
    @Test
    public void calculateGradesBFrom86()
    {
        Noten noten = new Noten();
        String Grade = noten.calculateGrades(86);

        assertEquals(Grade, "B");
    }

    @Test
    public void calculateGradesCFrom70()
    {
        Noten noten = new Noten();
        String Grade = noten.calculateGrades(70);

        assertEquals(Grade, "C");
    }

    @Test
    public void calculateGradesAFrom96()
    {
        Noten noten = new Noten();
        String Grade = noten.calculateGrades(96);

        assertEquals(Grade, "A");
    }

    @Test
    public void calculateGradesFFrom45()
    {
        Noten noten = new Noten();
        String Grade = noten.calculateGrades(45);

        assertEquals(Grade, "F");
    }

    @Test
    public void add2Plus2ShouldBe4()
    {
        Noten noten = new Noten();
        int result = noten.add(2, 2);

        assertEquals(result, 4);
    }

    @Test
    public void add3Plus5ShouldBe8()
    {
        Noten noten = new Noten();
        int result = noten.add(3, 5);

        assertEquals(result, 8);
    }
}