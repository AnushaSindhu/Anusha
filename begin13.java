import java.io.*;
import java.util.*;
public class begin13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=2;i<=a-1;i++)
{
if(a%i==0 || a!=i)
{
System.out.print("prime number");
break;
}
else
{
System.out.print("not prime number");
}
}
}
}