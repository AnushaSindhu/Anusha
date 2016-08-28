import java.io.*;
import java.util.*;
class player14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer();
String a=sc.nextLine();
sb.append(a);
sb.reverse();
String r;
System.out.println(sb);
r=a.replaceAll("[aeiouAEIOU]","");
System.out.println(r);
}
}
