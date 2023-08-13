class Pattern
{
public static void main(String...args)
{
for(int i=0;i<5;i++)
{
int k=i+1;
for(int j=0;j<5;j++)
{
if(j>=i)
{
System.out.print(k);
k=k+1;
}
else
System.out.print(" ");
}
System.out.println();

}
}
}