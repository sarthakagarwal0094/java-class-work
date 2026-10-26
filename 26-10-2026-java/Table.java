class Two implements Runnable{
public void run(){
int num=2;
for(int i=1;i<=10;i++){
System.out.println(num+" x "+i+" = "+(num*i));
}
}
}


class Ten extends Thread{
public void run(){
int num=10;
for(int i=1;i<=10;i++){
System.out.println(num+" x "+i+" = "+(num*i));
}
}
}

class Table{
public static void main(String[] args) throws Exception{
Two t1=new Two();
Thread t=new Thread(t1);
Ten t2=new Ten();
t.start();
t.join();
t2.start();
}
}