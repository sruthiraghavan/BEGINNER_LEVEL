import java.util.*;
class primenum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=n/2;
int flag=0;
for(int i=2;i<m;i++)
{
if(m%i==0)
flag=1;
System.out.println("not a prime");
break;
}
if(flag==0)
System.out.println("prime");
}
}


