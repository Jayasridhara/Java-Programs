public class Overload
{
public int MyMethod(int x,int y)
return x*y;
public double MyMethod(double x,double y)
return x*y;
}

public static void main(String...args)
{
Overload o=new Overload();

System.out.println(o.MyMethod(4,6));
System.out.println(o.MyMethod(2.8,9.0));

}
}