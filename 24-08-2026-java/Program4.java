import java.util.Scanner;
class Program4{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter your ID ");
int id=s.nextInt();
s.nextLine();
System.out.print("Enter you name :");
String name=s.nextLine();
System.out.println("Id : "+id+" Name :"+name);
}
}