import java.util.*;
class C
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=0,sum=0;
        while(n!=0)
        {
            t=n%10;
            sum=sum+t;
            n=n/10;
        }
        System.out.print(sum);
    }
}
