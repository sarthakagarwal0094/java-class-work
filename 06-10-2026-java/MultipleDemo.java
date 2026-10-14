class MultipleDemo{
public static void main(String[] args)
{
try{
String s=null;
System.out.println(s.length());
}catch(NullPointerException ne){
System.out.println("String is null");
try{int a=10/0;}catch(Exception e){System.out.println("Can not divide by zero");
}
}
}

}
