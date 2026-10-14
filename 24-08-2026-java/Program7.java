import java.util.Scanner;
class Program7
{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int age=s.nextInt();
if(age>=18){
System.out.println("You are above 18");
}else{
System.out.println("You are below 18");
}
}
}