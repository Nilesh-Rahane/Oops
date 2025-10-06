class MyRunnable implements Runnable{
public void run()
{
System.out.println("Thread is running..");
}
}

public class TestThread{
public static void main(String args[])
{
MyRunnable runnable=new MyRunnable();
Thread t1=new Thread(runnable);
t1.start();
}
}