class FinallyDemo{
public static void main(String[] args){
try{
int a=10/0;
System.out.println(a);
}/*catch(Exception e){
System.out.println(e.getMessage());
}*/finally{
System.out.println("FInally Block");
}
System.out.println("Rest of code");
}
}