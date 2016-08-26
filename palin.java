import java.io.*;
import java.util.*;
class palin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int a1=0;
int b=a;
while(a>0)
{
int n=a%10;
a1=a1*10+n;
a=a/10;
}
if(b==a1)
System.out.println("PALINDROME");
else
System.out.println("NOT PALINDROME");
}
}
