class Vehicle{
String company;
String model;
Vehicle(String company,String model){
this.company=company;
this.model=model;
}

}

class Car extends Vehicle{

int price;
Car(String company,String model,int price){
super(company,model);
this.price=price;
}

void display(){
System.out.println(company+"\t"+model+"\t"+price);
}
}
class Driver2{
public static void main(String[] args){
Car c=new Car("TATA","NEXON",10000000);
c.display();}

}

