import java.io.*;
import java.util.*;
class sum{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int count=0;
while(n!=0)
{
int a=n%10;
sum=sum+a;
n=n/10;
}
//System.out.println(sum);
if(sum<n)
{
System.out.println(sum);
}
else
{
System.out.println("not");
}
}}