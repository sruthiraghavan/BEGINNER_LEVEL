import java.util.*;
class great
{
    public  static void main(String args[])
    {
      int a=Integer.parseInt(args[0]);
      int b=Integer.parseInt(args[1]);
      int c=Integer.parseInt(args[2]);
      if(a>b)
      {
          System.out.println("a is the greatest");
      }
      else if(b>c)
      {
          System.out.println("b is the greatest");
      }
      else
      {
          System.out.println("c is the greatest");
      }
    }
}
