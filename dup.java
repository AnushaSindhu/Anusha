import java.io.*;
import java.util.*;
class dup
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String a=sc.nextLine();
char[] ch=a.toCharArray();
for(int i=0;i<a.length();i++)
{
for(int j=i+1;j<a.length();j++)
{
if(ch[i]==ch[j])
{
ch[i]=1;
}
}
}
for(int i=0;i<a.length();i++)
{
if(ch[i]!=1)
{
System.out.println(ch[i]);
}
}
}
}
