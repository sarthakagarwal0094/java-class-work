class Animal{
String name="Fido";
Animal dog()
{
	return this;
}
public static void main(String[] args){
Animal a1=new Animal();
Animal a2=a1.dog();
a2.name="Kito";
System.out.println("Name of dog 2"+a2.name);
System.out.println("Name of dog 1"+a1.name);
}

}