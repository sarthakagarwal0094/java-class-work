class MyT implements Runnable{
	public void run(){
	System.out.println("Hellooo");
}
}

class RunnableDemo{
public static void main(String[] args) throws Exception{
Thread t1= new Thread(new MyT());
Thread t2=new Thread(new MyT()); 
t1.start();
t2.sleep(5000);
t2.start();
}
}