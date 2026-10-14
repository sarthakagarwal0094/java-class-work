class Student{
int id;
String name;
public static void main(String[] agrs){
int[] ids={101,102,103,104,105};
String[] names={"Sam","Raj","Sneha","Simran","Akshay"};
Student[] s = new Student[5];
for(int i=0;i<5;i++){
	s[i]=new Student();
	s[i].id=ids[i];
	s[i].name=names[i];
	System.out.println("Id : "+s[i].id+" | Name : "+s[i].name); 
}

}
}
