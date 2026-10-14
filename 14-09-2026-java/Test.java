import java.util.*;
class Test{

public static void main(String[] args){
/*int[] arr={1,2,3,4,5,10,6,7,8,9};
Scanner sc=new Scanner(System.in);
System.out.print("Enter Length:");
int len=sc.nextInt();
int[] arr2;
arr2=new int[len];
for(int i=0;i<len;i++){
System.out.print("Enter "+(i+1)+" element :");
arr2[i]=sc.nextInt();
}

System.out.println("===============================================================");
//traversing
for(int value:arr2){
System.out.println("Value is : "+value);
}
*/

int sum=0;
for(int i=0;i<args.length;i++){
sum+=Integer.parseInt(args[i]);
}

System.out.println("Sum of number is : "+sum);
}
}