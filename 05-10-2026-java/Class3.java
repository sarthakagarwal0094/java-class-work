class UnderAge extends Exception{
UnderAge(String s)
{
	super(s);
}
}
class Class3{
public static void main(String[] args){
try{
System.out.println("Hello i am try i won't cry");
int age=4;
if(age<18){
throw new UnderAge("You are under age");}
}catch(Exception e){
System.out.println(e);
}finally{
System.out.println("Final block");
}
System.out.println("Rest of code");
}
}