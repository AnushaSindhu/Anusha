import java.io.*;
import java.util.*;
public class begin3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
char c=a.charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.print("vowel");
}
else
{
System.out.print("consonant");
}
}
}

