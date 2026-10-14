class Program1{
public static void main(String[] args){
String result="Grade ";
int marks =87;
if(marks>=90)
	result+="A";
else if(marks>=80)
	result+="B";
else if(marks>=70)
	result+="C";
else if(marks>=60)
	result+="D";
else
	result+="F";
System.out.println(result);
}
}