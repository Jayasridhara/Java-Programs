import java.util.*;
import java.util.stream.*;
import java.util.stream.Stream.*;
class Rev 
{

public static void main(String args[])
{

List<String> s=Arrays.stream("this is the sentences".split(" ")).map(x -> new StringBuffer(x).reverse()).collect(Collectors.toList());
String k="";
for(String i: s)
k+=i+" ";
System.out.println(k.trim());

}
}


   
