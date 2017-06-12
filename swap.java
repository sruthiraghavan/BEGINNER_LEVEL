import java.util.*;
class swap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int temp=0;
System.out.print("before swapping");
System.out.println(a);
System.out.println(b);
temp=a;
a=b;
b=temp;
System.out.println("After swapping");
System.out.println(a);
System.out.println(b);
}
}
