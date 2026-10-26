import java.lang.Thread;
class MyThread extends Thread{
   
public void run(){
     
for(int i=0;i<1000;i++){
System.out.println("--->"+getName());
}

}
}

class TestThread{
public static void main(String[] args) throws Exception{
MyThread t1=new MyThread();
MyThread t2=new MyThread();
t1.start();
t1.join();
t2.start();
t2.join();



}
}