class Reverse{
public static void main(String args[]){
int rev=0;
int rem;
int num=3456;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num/=10;
}
System.out.print(rev);
}
}