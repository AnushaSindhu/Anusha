import java.io.*;
import java.util.*;
public class begin16
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
int b=a;
while(a>0)
{
int n=a%10;
sum+=n*n*n;
a=a/10;
}
if(b==sum)
{
System.out.print("Armstrong number");
}
else
{
System.out.print("Not Armstrong Number");
}
}
}
