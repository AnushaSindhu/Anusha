import java.io.*;
import java.util.*;
class hunter85
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
int a=sc.nextInt();
for(int i=0;i<=a;i++)
{
String s=""+i;
if(s.contains(""+2))
{
count++;
}
}
System.out.print(count);
}
}
