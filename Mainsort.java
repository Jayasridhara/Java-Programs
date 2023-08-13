import java.util.*;
class Mycomp implements Comparator<Stud>
{
public int compare(Stud a,Stud b)
{
if(a.wgt!=b.wgt)
return Double.valueOf(b.wgt).compareTo(Double.valueOf(a.wgt));
else
if(a.name.equals(b.name)!=false)
return  String.valueOf(b.name).compareTo(String.valueOf(a.wgt));
else
return  Integer.valueOf(b.s).compareTo(Integer.valueOf(a.s));
}
}

class Stud
{

int s;
String name;
Double wgt;
Stud(int s,String name,double wgt)
{
this.s=s;
this.name=name;
this.wgt=wgt;
}

public String  toString()
{
return s +"\t"+name+"\t"+wgt;
}

}
 
class Mainsort
{
public static void main(String...args)
{

List<Stud> l=new ArrayList<>();
l.add(new Stud(1,"crseven",45.8));
l.add(new Stud(2,"crseven",45.8));
l.add(new Stud(3,"messi",49.8));
l.add(new Stud(4,"mahi",47.8));
l.add(new Stud(5,"mahi",47.8));
l.sort(new Mycomp());
for(Stud i:l)
System.out.println(i);

}
}
 