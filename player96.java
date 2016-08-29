import java.io.*;
import java.util.*;
class player96
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] b=new int[a];
int sum=0;
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
Arrays.sort(b);
sum=b[0]+b[b.length-1];
System.out.print(sum);
}
}