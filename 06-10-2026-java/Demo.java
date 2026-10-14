class Demo1{
static void method1(){
int a=10/0;
}
class Demo{
public static void main(String[] args){
try{
method1();
}catch(Exception e){
System.out.println(e);
}
}	