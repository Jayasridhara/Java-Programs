import java.util.*;
import java.util.stream.*;
import java.util.stream.Stream.*;
class Strrev 
{

public static void main(String args[])
{
Arrays.stream("this is the sentences".split(" ")).map(x -> new StringBuffer(x).reverse()).forEach(System.out::println);

}
}