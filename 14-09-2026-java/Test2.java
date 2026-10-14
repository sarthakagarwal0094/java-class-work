class Test2{
public static void main(String[] args){
int arr[]={10,90,70,80,40};
int max=arr[0];
int min=arr[0+1];
for(int val:arr){
if(val>max){
max=val;
}
if(val<min){min=val;}
}
System.out.println(max);
System.out.println(min);
}
}