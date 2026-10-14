import java.util.Scanner;
class Program3
{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);
int nums=sc.nextInt();
int[] ar=new int[nums];

System.out.println("Task Executed");
for(int i=0;i<nums;i++){
int val=sc.nextInt();
ar[i]=val;
}
for(int i=0;i<nums;i++){
System.out.println(ar[i]);
}
}
}




