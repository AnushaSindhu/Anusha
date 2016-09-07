import java.io.*;
import java.util.*;
classplayer63
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<Integer>();
int a=sc.nextInt();
int c=sc.nextInt();
int count=0;
int[] b=new int[a];
int[] d=new int[c];
for(int i=0;i<=a;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<=a;i++)
{
d[i]=sc.nextInt();
}
for(int i1=0;i1<b.length;i1++)
{
for(int j1=1;j1<d.length;j1++)
{
if(b[i1]==d[j1])
{
count++;
al.add(b[i1]);
}
if(count>1)
{
System.out.print(al);
}
else
{
System.out.print(-1);
}
}
}
}
}