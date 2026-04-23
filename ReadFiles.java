import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ReadFiles
{
    public static void main(String[] args) throws IOException
	{
        String content = new String(Files.readAllBytes(Paths.get("output.txt")));
        System.out.println(content);
    }
}