import java.io.*;
public class FileInputStreamDemo{
    public static void main(String[] args){
        
        try{
             FileInputStream  fis= new FileInputStream("newfile.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
             fis.close();

        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}