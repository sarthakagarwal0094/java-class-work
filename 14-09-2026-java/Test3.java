class Test3{
public static void main(String[] args){
int count=0;
int arr[]={1,2,3,4,5,6,7,8,9};
for(int val:arr){
if(val%2==0){
System.out.println(val);
count++;
}
}
System.out.println("Total count :"+count);
}
}