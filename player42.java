import java.io.*;
import java.util.*;
classplayer42
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
int[] b=new int[a];
for(int i=0;i<=b.length;i++)
{
b[i]=sc.nextInt();
}
for(int i1=0;i1<b.length-1;i1++)
{
if(b[i1]<b[i1+1])
{
count++;
}
}
if(count==b.length-1)
{
System.out.print("array sorted");
}
else
{
System.out.print("array not sorted");
}
}
}
