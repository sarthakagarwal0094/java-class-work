import java.util.Scanner;
class Program5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter your roll");
int roll=sc.nextInt();
sc.nextLine();
System.out.print("Enter your name");
String name=sc.nextLine();
System.out.print("Enter your course");
String course=sc.nextLine();
System.out.print("Enter your percentage");
float per=sc.nextFloat();

System.out.println("id is: "+roll+"\n"+
"Name is : "+name+"\n"+
"Course is : "+course+"\n"+
"Percentage is : "+per);
}
}