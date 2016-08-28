import java.io.*;
import java.util.*;
class player13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
 b=b*b;
int s=0;
while(b>1)
{
s=0;
while(b>0)
{
int c=b%10;
s+=c*c;
b=b/10;
}
if(s>9)
{
b=s;
}
}
if(s==1)
System.out.print("happy number");
else
System.out.print("unhappy number");
}
}