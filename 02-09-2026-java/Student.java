class Student{
private String name;
private int age;

//setter
public void set(String name,int age){
this.name=name;
this.age=age;
}

//getter
public void get(){
System.out.println("Name is :"+name+"\n"+"Age is :"+age);
}

private static void main(String[] args){
Student s1=new Student();
s1.set("",22);
s1.get();
Class<?> childClass = Student.class;

 Class<?> superClass = childClass.getSuperclass();

        System.out.println("Superclass of Child is: " + superClass.getName());
}
}