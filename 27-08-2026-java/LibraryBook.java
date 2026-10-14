class LibraryBook{
String title;
String author;
int price;
public LibraryBook(String title,String author,int price)
{
	this.title=title;
	this.author=author;
	this.price=price;
}

public void dsp(){
System.out.println("Title is : "+title);
System.out.println("Author is : "+author);
if(price>500){
System.out.println("Price is : "+(price-(price*0.1)));
}else{
System.out.println("Price is : "+price);
}

}

public static void main(String[] args){
LibraryBook lb=new LibraryBook("Head First","Kathley Kallye",600);
lb.dsp();
}
}