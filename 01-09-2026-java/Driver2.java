class Shape{
void area(){
System.out.println("Calcualte Area");
}
}
class Circle extends Shape{
@Override
void area(){
System.out.println("Area of circle is : 3.14*r*r");
}
}

class Rectangle extends Shape{
@Override
void area(){
System.out.println("Area if rectangle is : length * breadth");
}
}

class Triangle extends Shape{
@Override
void area(){
System.out.println("Area of trinagle is : height*base/2");
}
}

class Driver2{
public static void main(String[] args){
Shape s;
s=new Circle();
s.area();
s=new Rectangle();
s.area();
s=new Triangle();
s.area();
}
}
