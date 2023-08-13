import java.util.*;
class Prime
{
Prime(int n)
{
int f=1;
for(int i=3;i<=Math.sqrt(n);i=i+2)
{
if(n%i==0)
{
f=0;
break;
}
}
if(f==1)
return f;
}
}


class Primefact
{
public static void main(String...args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=2 && n%2==0)
{
System.out.println("2");
}
for(int i=3;i<=n;i=i+2)
{
if(n%i==0 && i!=1)
{
Prime s=new Prime(i);
if(s==1)
{
System.out.println(i);
}
}
}
}
}