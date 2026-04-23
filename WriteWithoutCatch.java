import java.io.FileWriter;
import java.io.IOException;

public class WriteWithoutCatch 
{
    public static void main(String[] args) throws IOException 
	{
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Writing without try-catch block");
        writer.close();

        System.out.println("Done!");
    }
}