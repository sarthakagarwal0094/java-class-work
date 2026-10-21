import java.io.*;
class FileOutputStreamDemo{
    public static void main(String[] args){
        try{
            FileOutputStream fos=new FileOutputStream("newfile.txt");
            String data="I love java";
            byte[] bytedata=data.getBytes();
            fos.write(bytedata);
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            fos.close();
        }
        
    }

}