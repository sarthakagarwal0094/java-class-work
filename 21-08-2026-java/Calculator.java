class Calculator{
public static void main(String[] args){
char ch='-';
int a=20,b=30;
switch(ch){
case '+':
System.out.println("Sum of numbers is"+(a+b));
break;
case '-':
System.out.println("Difference of numbers is"+(a-b));
break;
case '*':
System.out.println("Multiplication of numbers is"+(a*b));
break;
case '/':
System.out.println("Division of numbers"+(a/b));
break;
default:
System.out.println("Wrong Operator");
}
}
}
