class Count{
int i=10;
synchronized void increase(){
	i++;
	//System.out.println("")
}
}

class thread1 extends Thread{
	Count c;
	thread1(Count c){
		this.c=c;
}
	public void run(){
		c.increase();
	
}
}

class WithSync{
	public static void main(String[] args) throws Exception{
		Count c= new Count();
		thread1 t1= new thread1(c);
		thread1 t2= new thread1(c);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final value :"+c.i);

	}
}