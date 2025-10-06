public class Multi extends Thread
{
public void run()
{
for(int i=0;i<6;i++)
System.out.println("thread " +i+"is running");
}
public static void main(String args[])
{
Multi m1=new Multi();
Multi  m2=new Multi();
m1.start();
m2.start();
}
}