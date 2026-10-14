class Student{
private int id;
private String name;
public void set(int id,String name){
this.id=id;
this.name=name;
}
public void get(){
System.out.println("Id is : "+id+" Name is : "+name );
}
}
class Driver{
public static void main(String[] agrs){
Student s=new Student();
s.set(101,"Aman Singh");
s.get();
}
}
