import java.io.*;
import java.util.*;
class player97
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int d=sc.nextInt();
int sum=0;
for(int i=c;i<=d;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.print(sum);
}
}

