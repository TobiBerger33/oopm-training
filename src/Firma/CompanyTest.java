package Firma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

class CompanyTest
{
    @Test
    public void testAddDeveloper()
    {
        Company company = new Company(5);
        Laptop laptop = new Laptop("TestLaptop");
        Developer developer = new Developer(laptop, 1);

        company.addDev(developer);

        assertNotEquals(company.developers[0], null);
    }

    @Test
    public void ChangeWorkingYearsTo45AndNameToTest()
    {
        Company company = new Company(5);
        Developer developer = new Developer("Hermann", 1);

        company.addDev(developer);

        company.changeDevInfo("Test", 45, 0);

        assertEquals(company.developers[0].getName(), "Test");
        assertEquals(company.developers[0].getWorkingYears(), 45);
    }


    @Test
    public void sendDevsToWorkShouldIncreasePointsBy10()
    {
        Company company = new Company(5);
        Device laptop = new Laptop("TestLaptop");

        company.addDev(new Developer(laptop, 1));
        company.addDev(new Developer(laptop, 1));

        company.sendToWork();

        assertEquals(company.developers[0].getPoints(), 20);
        assertEquals(company.developers[1].getPoints(), 20);


        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {company.sendToWork();});


    }


}