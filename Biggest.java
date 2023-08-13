import java.util.*;
class Yash
{
public static void main(String...args)
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter n\n");
int n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("enter element\n");
a[i]=sc.nextInt();
}
int b=a[0];
for(i=0;i<n;i++)
if(a[i]>b)
b=a[i];

System.out.println(b+"Biggest");
}
}