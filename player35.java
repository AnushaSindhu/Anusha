import java.io.*;
import java.util.*;
class player35
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length()-1;i++)
{
System.out.print(s.charAt(i));
if(s.charAt(i)==s.charAt(i+1))
{
System.out.print("*");
}
}
System.out.print(s.charAt(s.length()-1));
}
}