import java.nio.file.*;
import java.io.IOException;
class NIODemo{
public static void main(String[] args) throws IOException
{
	
	
	Path p=Paths.get("newtextfile.txt");
	Path p1=Paths.get("niotextfile.txt");
	Files.writeString(p,"Hello, My name is Sarthak Agarwal");
	System.out.println("Data written sucessfully");
	String data=Files.readString(p);
	System.out.print(data);
	Files.copy(p,p1);
}
}