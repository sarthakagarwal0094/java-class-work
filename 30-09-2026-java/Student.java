import java.util.Scanner;
class Student{
int roll;
String name;
static int ac=0;
int marks;

Student(int r,String n,int m){
roll=r;
name=n;
marks=m;

ac++;
System.out.println("Roll number is: "+roll+"\nName is: "+name);
}
public static void main(String[] args){

Student[] st=new Student[3];
st[0]=new Student(94,"Sarthak Agarwal",90);
st[1]=new Student(144,"Parth Arora",89);
st[2]=new Student(50,"Shivani",91);
for(Student s: st){
int high=0;
if(s.marks<high){
high=s.marks;
}
if(s.marks==high){
System.out.println(s.name);
}
}
}
}


