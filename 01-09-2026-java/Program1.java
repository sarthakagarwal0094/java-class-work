class Program1{
void add(String s1,String s2){
System.out.println(s1+" "+s2);
}
void add(int a,int b){
System.out.println(a+b);
}
public static void main(String[] args){
Program1 p=new Program1();
p.add(9,7);
p.add("Hello","Sarthak");

int b=3;
byte a=(byte)b;
System.out.println(a);

}
}