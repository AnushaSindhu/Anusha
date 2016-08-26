import java.io.*;
import java.util.*;
public class begin10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
while(a>0)
{
int b=a%10;
count++;
a=a/10;
}
System.out.print(count);
}
}