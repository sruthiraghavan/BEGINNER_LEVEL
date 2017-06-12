import java.util.*;
class oddin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
for(int i=a;i<=b;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
}
