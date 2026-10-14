class Animal{
public void sound(){
System.out.println("Animals makes sound");
}
}

class Dog extends Animal{
@Override
public void sound(){
System.out.println("Dog Barks !!");
}
}

class Driver{
public static void main(String[] args){
//Dynamic Method Dispatch...

Animal d=new Dog();
d.sound();
}
}
