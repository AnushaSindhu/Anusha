import java.io.*;
import java.util.*;
class rep
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] a1=new int[a];
int count=0;
for(int i=0;i<a;i++)
{
a1[i]=sc.nextInt();
}
for(int j=0;j<a;j++)
{
for(int k=0;k<a;k++)
{
if(a1[j]==a1[k])
{
count++;
}
}
if(count==1)
{
System.out.println(a1[j]);
}
count=0;
}
}
}
