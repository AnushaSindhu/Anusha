import java.io.*;
import java.util.*;
class begin15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=a+1;i<b;i++)
{
if(i%2==0)
{
al.add(i);
}
else
{
}
}
System.out.print(al);
}
}

