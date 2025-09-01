public class MethodOverloading {
    public int Add(int a,int b)
    {
        return a+b;
    }
    public int Add(int a,int b,int c)
    {
        return a+b+c;
    }
public static void main(String[] args){
    MethodOverloading M=new MethodOverloading();
    System.out.println(M.Add(1,2));
    System.out.println(M.Add(1,2,3));
}
}
