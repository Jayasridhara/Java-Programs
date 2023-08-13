import java.net.*;
import java.io.*;
class MyClient
{
public static void main(String args[])throws Exception
{



Socket s=new Socket(InetAddress.getByName("localhost"),2023);

BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintStream ps=new PrintStream(s.getOutputStream());
BufferedReader bg= new BufferedReader(new InputStreamReader(System.in));

while(true)
{
System.out.println("Enter msg");
String str = bg.readLine();
ps.println(str);
System.out.println(br.readLine());
}

}
}