import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
class Serverchat extends JFrame
{
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2;
List li1;
ServerSocket ss;
Socket s;
BufferedReader br;
PrintStream ps;
Serverchat()
{
setVisible(true);
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1 = new JLabel("Name ");
l2 = new JLabel("Msg ");
l3 = new JLabel("History ");
t1 = new JTextField(20);
t2 = new JTextField(20);
b1 = new JButton("Send");
b2 = new JButton("Receive");
li1 = new List(10);

setLayout(null);
add(l1);add(l2);add(l3);
add(t1);add(t2);add(b1);add(b2);
add(li1);
l1.setBounds(100,100,100,20);
t1.setBounds(100,120,100,20);
l2.setBounds(100,160,100,20);
t2.setBounds(100,180,300,20);
l3.setBounds(100,220,100,20);
li1.setBounds(100,240,300,300);
b1.setBounds(420,240,90,20);
b2.setBounds(420,280,90,20);
try
{
ss = new ServerSocket(2023);
s = ss.accept();
br = new BufferedReader(new InputStreamReader(s.getInputStream()));
ps = new PrintStream(s.getOutputStream());
}catch(Exception e){}
b1.addActionListener(ae -> {
String name = t1.getText();
String m = t2.getText();
String msg = name+" : "+m+"\n";
ps.println(msg);
li1.add(msg);
t2.setText("");
});
b2.addActionListener(ae ->{
try{
String m = br.readLine();
li1.add(m);
}catch(Exception e){}

});
}
public static void main(String arg[])
{
new Serverchat();
}
}