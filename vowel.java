import java.util.*;
class vowel
{
    public  static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
		char ch;
        ch=s.next().charAt(0);
         if(ch=='a' || ch=='e' || ch=='i' || ch=='0' ||
        ch=='u' || ch=='A' || ch=='E' || ch=='I' ||
        ch=='O' || ch=='U')

        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}
      
