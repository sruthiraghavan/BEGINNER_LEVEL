import java.util.*;
class gcd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int first=s.nextInt();
int sec=s.nextInt();
int n=first*sec;
int g=1;
for(int i=2;i<n;i++)
{
if(first%i==0&&sec%i==0)
g=i;
}
System.out.println(+g);
}
}

