import java.io.*;
import java.util.*;
public class begin4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
char c=a.charAt(0);
if((c>'Z' && c<'A') || (c>'a' && c<'z'))
{
System.out.print("Alphabet");
}
else
{
System.out.print("Not Alphabet");
}
}
}