class StudentClass{
int id;
static String college="KIET";
StudentClass(int id){
this.id=id;
}

static{
System.out.println("Welcome to KIET ");

}
}
class Student{
static{
System.out.println("Welcome to MCA");
}
public static void  display(){
System.out.println("Hello this is satic method");
}
public static void main(String[] args){
StudentClass s1=new StudentClass(1);
StudentClass s2=new StudentClass(2);
System.out.println(s1.id+" "+StudentClass.college);
System.out.println(s2.id+" "+StudentClass.college);
display();
}
}