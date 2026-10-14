class NotEligibleException extends Exception{
public NotEligibleException(String s){
super(s);
}
}

class Program4{
public static void main(String[] args){
	int marks=12;
	try{
	if(marks<35){
		throw new NotEligibleException("Not eligible for admission");
	}
	}catch(NotEligibleException e){
		System.out.println(e.getMessage());
		}


}

}