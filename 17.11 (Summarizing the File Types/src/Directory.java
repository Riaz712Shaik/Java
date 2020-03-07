import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Directory
{
   public static void main(String args[]) throws IOException
   {

	   Path dir = Paths.get("C:\\spark");
        List<Path> result = new ArrayList<>();
  try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.{PNG,pkl,json,java,txt,ipynb}")) {
    for (Path entry: stream) {
    result.add(entry);
    }
        } catch (DirectoryIteratorException ex) {
    throw ex.getCause();
        }
       for (Path path : result) {
    	   System.out.println(path);
		
	}
}
}
