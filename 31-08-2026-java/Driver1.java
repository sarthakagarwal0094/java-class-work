import java.util.Scanner;
class Person{
String name;
int age;
}


class Student extends Person{
int roll;
int marks;
void display(){
System.out.println(name+"\t"+age+"\t"+roll+"\t"+marks);
}
}

class Driver1{
public static void main(String[] args){
Student s=new Student();
Scanner sc =new Scanner(System.in);
System.out.print("Enter name");
s.name=sc.nextLine();
sc.nextLine();
System.out.print("Enter age");
s.age=sc.nextInt();
System.out.print("Enter roll");
s.roll=sc.nextInt();
System.out.print("Enter marks");
s.marks=sc.nextInt();
s.display();
}

}