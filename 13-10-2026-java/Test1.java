import Pack1.P1;
class Test1{
void main(){
P1 p= new P1();
try{
System.out.println(p.name);
}catch(Throwable t){
System.out.println("Hello this is an error");
}
}
}