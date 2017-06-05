import java.util.*;
class alphabet
{
    public  static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
		    char ch;
        ch=s.next().charAt(0);
        if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))

        {
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("not an alphabet");
        }
    }
}
      
