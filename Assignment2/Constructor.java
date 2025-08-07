import java.util.*;
public class Constructor{
String name;
int RollNo;
float CGPA;
int sem;
String College_name;

public Constructor(){
	System.out.println("Name: "+name+" RollNo: "+RollNo+"CGPA: "+CGPA+"Semister: "+sem+"College Name: "+College_name);
}
public Constructor(String N ,int R,float CG,int S, String CN){
	name=N;
	RollNo=R;
	CGPA=CG;
	sem=S;
	College_name=CN;
	System.out.println("Name: "+name+" RollNo: "+RollNo+"CGPA: "+CGPA+"Semister: "+sem+"College Name: "+College_name);
}
public Constructor(String N ,int R){
	name=N;
	RollNo=R;
	System.out.println("Name: "+name+" RollNo: "+RollNo);
}
public Constructor(String N ,int R,float CG){
	name=N;
	RollNo=R;
	CGPA=CG;
	System.out.println("Name: "+name+" RollNo: "+RollNo+"CGPA: "+CGPA);
}

public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter the name:");
String name=Sc.next();
System.out.println("enter the Roll No:");
int RollNo=Sc.nextInt();
System.out.println("enter the CGPA:");
float CGPA=Sc.nextFloat();
System.out.println("enter the CollegeName:");
String College_name=Sc.next();
System.out.println("enter the Semister:");
int sem=Sc.nextInt();
Constructor obj1=new Constructor(name,RollNo,CGPA,sem,College_name);
Constructor obj2=new Constructor(name,RollNo,CGPA,sem,College_name);
Constructor obj3=new Constructor(name,RollNo,sem);
Constructor obj4=new Constructor(name,RollNo,CGPA);




       
}
}