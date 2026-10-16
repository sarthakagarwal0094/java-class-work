import java.io.*;
public class File1{
void main(){
    try{
        File f=new File("newFile.txt");
        if(f.createNewFile()){
            System.out.println("File Created : "+f.getName());
        }else{
            System.out.println("File Exists : "+f.getPath());
        }

    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}