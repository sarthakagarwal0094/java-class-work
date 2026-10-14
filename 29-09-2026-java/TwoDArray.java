import java.util.Scanner;
class TwoDArray{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int a[][]= new int[2][2];


for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
a[i][j]=sc.nextInt();
}
System.out.println();
}



System.out.println("++++++++++++++++++ Values are ++++++++++++++++++");
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
