abstract class Vehicle{
abstract public void start();
abstract public void stop();
public void run(){
System.out.println("Car is running");
}
}
abstract class Car extends Vehicle{
public void start(){
System.out.println("Car is running");
}
}
class Bike extends Car{
public void stop(){
System.out.println("Stop");
}
}
class abs1{
public static void main(String[] args){
Bike bk=new Bike();
bk.run();
bk.start();
bk.stop();
Sytem.out

}}