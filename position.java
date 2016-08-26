import java.io.*;
import java.util.*;
class position
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
for(int i=0;i<a1.length;i++)
{
if(a1[i]==i)
{
System.out.print("The number equal to its index is:"+a1[i]);
}
else
{
System.out.print("No numbers exist");
break;
}
}
}
}

