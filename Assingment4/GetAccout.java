abstract class BankAccount{
abstract void deposite();
abstract void withdrawl();
abstract void checkbalance();
void getdetails(){
System.out.println("get the detais like name,email,mob number, aadhar.");
}
}
class SavingAccount extends BankAccount{
void deposite()
{
System.out.println("Rs.5000 is Deposite");
}
void withdrawl()
{
System.out.println("Rs. 3000 is withdrawl.");
}
void checkbalance()
{
System.out.println("Rs. 2000 is remaing balnace");
}
}

public class GetAccout{
public static void main(String args[])
{
BankAccount G=new SavingAccount();
G.getdetails();
G.deposite();
G.withdrawl();
G.checkbalance();
}
}