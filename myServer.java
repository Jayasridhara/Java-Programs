import java.net.*;
import java.io.*;
class myServer 
{
public static void main(String args[])throws Exception
{


ServerSocket ss = new ServerSocket(2023);
Socket s=ss.accept();

BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintStream ps=new PrintStream(s.getOutputStream());
BufferedReader bg= new BufferedReader(new InputStreamReader(System.in));

while(true)
{
System.out.println(br.readLine());
System.out.println("Enter msg :");
String str = bg.readLine();
ps.println(str);
}
}
}


