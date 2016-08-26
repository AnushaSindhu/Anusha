import java.io.*;
import java.util.*;
public class begin12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=0;
int count=0;
while(a>0)
{
n=a%10;
a=a/10;
}
if(a!=n)
{
System.out.print("NOT PALINDROME");
}
else
{
System.out.print("PALINDROME");
}
}
}
