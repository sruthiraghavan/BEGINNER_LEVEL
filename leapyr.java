import java.util.*;
class leapyr
{
    public  static void main(String args[])
    {
      int n=Integer.parseInt(args[0]);
      if(n%4==0)
      {
          System.out.print("leap year");
      }
      else
      {
          System.out.print("not a leap year");
      }
    }
}
