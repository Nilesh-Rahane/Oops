public class Multi1 implements Runnable{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Thread "+Thread.currentThread().getName()+" is running");
}
}
public static void main(String args[])
{
Multi1 m=new Multi1();
Thread t1=new Thread(m,"1");
Thread t2=new Thread(m,"2");
t1.start();
t2.start();
}
}