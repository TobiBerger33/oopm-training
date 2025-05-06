package Files;

public class FileMain
{
    public static void main(String[] args)
    {
        FilesTest filesTest = new FilesTest();

        filesTest.init();

        filesTest.writeToFile();

        filesTest.readFromFile();

        filesTest.printData();
    }
}
