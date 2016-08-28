import java.io.*;
import java.util.*;
class player35
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer();
String a=sc.next();
char[] ch=new char[a.length()];
ch=a.toCharArray();
for(int i=0;i<ch.length-1;i++)
{
if(ch[i]==ch[i+1])
{
sb.append("*");
}
else
{
}
System.out.print(sb);
}
}
}
