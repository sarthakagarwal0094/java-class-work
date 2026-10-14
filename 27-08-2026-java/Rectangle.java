class Rectangle{
int length;
int width;
public Rectangle(int length,int width){
this.length=length;
this.width=width;
}
public void area(){
System.out.println("Area is : "+(length*width));
}
public void perimeter(){
System.out.println("Perimeter is : "+2*(length+width));
}

public static void main(String[] agrs){
Rectangle r=new Rectangle(20,10);
r.area();
r.perimeter();
}
}