import java.io.*;
import java.util.*;
class target
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in the array");
int a=sc.nextInt();
System.out.print("Enter the numbers in the array");
int[] a1=new int[a];
for(int i=0;i<a;i++)
{
a1[i]=sc.nextInt();
}
System.out.print("Enter your target");
int b=sc.nextInt();
for(int i=0;i<a1.length;i++)
{
for(int j=i+1;j<a1.length;j++)
{
if(a1[i]+a1[j]==b)
{
System.out.print("The numbers are:"+a1[i] +"and" +a1[j]);
break;
}
}
}
}
}

