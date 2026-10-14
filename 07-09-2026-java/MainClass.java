abstract class Shape{
abstract void calculateArea();
}
class Circle extends Shape{
int r;
Circle(int r){
this.r=r;
}
@Override
void calculateArea(){
System.out.println(r*r*3.14);
}
}
class Rectangle extends Shape{
int l,b;
Rectangle(int l,int b){
this.l=l;
this.b=b;
}
@Override
void calculateArea(){
System.out.println(l*b);
}
}

class MainClass{
public static void main(String[] args){
Circle c=new Circle(10);
c.calculateArea();
Rectangle r= new Rectangle(10,9);
r.calculateArea();
}
}
