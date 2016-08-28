import java.io.*;
import java.util.*;
class player95
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] b=new int[a];
for(int i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
}
Arrays.sort(b);
System.out.print(b[b.length-2]);
}
}