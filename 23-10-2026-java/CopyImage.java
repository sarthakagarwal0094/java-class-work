import java.io.*;
class CopyImage{
	public static void main(String[] args){
	try{
	FileInputStream fis = new FileInputStream("source.jpg");
	FileOutputStream fos = new FileOutputStream("copy.png");
	int i;
	while((i=fis.read())!=-1){
	fos.write(i);
	}
	fis.close();
	fos.close();
	System.out.println("File Copied Sucessfully !!");
	}catch(IOException e){
		System.out.println(e);
	}
}
}