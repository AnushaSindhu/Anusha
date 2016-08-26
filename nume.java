import java.io.*;
import java.util.*;
class nume
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int co=0;
for(int i=0;i<s.length();i++)
{
System.out.println("hi");
char c[i]=s.toCharArray();

for(int j=0;j<c.length;j++)
{
System.out.println(c.length);
if(Character.isDigit(c[j]))
{
co++;
}
System.out.println(co);
}
co=0;
}

}
}
