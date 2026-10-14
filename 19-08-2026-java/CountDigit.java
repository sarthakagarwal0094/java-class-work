class CountDigit{
public static void main(String[] args){
int count=0;
int num=2989;
while(num>0){
num/=10;
count++;
}
System.out.println("Number of digits is " +count);
}
}
