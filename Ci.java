import java.io.*;
class Ci
{
public static void main(String...args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter p,r,n:");
double p=Double.valueOf(br.readLine());
double r=Double.valueOf(br.readLine());
int n=Integer.valueOf(br.readLine());
double ci=p*Math.pow(1+r/100,n)-p;
System.out.println(ci);
}
}