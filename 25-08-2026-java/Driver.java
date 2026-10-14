class Student{
String name;
int age;
public Student(String name,int age){
this.name=name;
this.age=age;
this();
}

public Student(){
System.out.println("Constructor is called");
}

}


class Driver{
public static void main(String[] args){
Student s=new Student("Sarthak Agarwal",22);
System.out.println("Name is: "+s.name+"\nAge is: "+s.age);
}


}
