import java.io.*;
class CopyText{
public static void main(String[] args){
try{
FileReader fr =new FileReader("newtextfile.txt");
FileWriter fw = new FileWriter("copiedtextfile.txt");
int i;
while((i=fr.read())!=-1){
fw.write(i);
}
fr.close();
fw.close();
System.out.println("File copied sucessfully !!");

}catch(IOException e){
System.out.println(e.getMessage());
}
}
}