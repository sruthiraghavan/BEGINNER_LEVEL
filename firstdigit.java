import java.util.*;
class firstdigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(Character.isDigit(s.charAt(0)))
System.out.print(true);
else
System.out.print(false);
}
}

