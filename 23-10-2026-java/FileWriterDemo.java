import java.io.*;
class FileWriterDemo{
public static void main(String[] args){
	try{
	FileWriter fw=new FileWriter("newtextfile.txt");
	String data="Hello java , How are you?";
	fw.write(data);
	System.out.println("Bravo !!!");
	fw.close();
	}catch(IOException e){
	System.out.println(e.getMessage());
		}
}
}

