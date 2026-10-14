import java.util.Scanner;
class Program6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[] name=new String[5];
int[] age=new int[5];
String[] city=new String[5];
for(int i=0;i<5;i++){
System.out.print("Enter "+(i+1)+" Customer name :");
name[i]=sc.nextLine();
System.out.print("Enter "+(i+1)+"customer age : ");
age[i]=sc.nextInt();
sc.nextLine();
System.out.print("Enter "+(i+1)+"customer city : ");
city[i]=sc.nextLine();
}


for(int i=0;i<5;i++){
System.out.println("Customer name :"+name[i]+"\n"+
"Customer age is" +age[i]+"\n"+
"Cutomer city is "+city[i]);
}
}
}




