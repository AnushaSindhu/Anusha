import java.io.*;
import java.util.*;
class player12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("Enter the array");
int[] b=new int[a];
for(int i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
}
System.out.print("Enter the key");
int key=sc.nextInt();
for(int j=key;j<a;j++)
{
System.out.print(b[j]);
}
for(int k=0;k<key;k++)
{
System.out.print(b[k]);
}
}
}

