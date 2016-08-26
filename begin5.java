import java.io.*;
import java.util.*;
public class begin5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] b=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
Arrays.sort(b);
System.out.print("The largest number is"+" "+b[a-1]);
}
}
