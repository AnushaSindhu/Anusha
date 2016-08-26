import java.io.*;
import java.util.*;
class fibo{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int co=1;
int c=1,b=1,a=0;
while(co<=n)
{
System.out.println(c);
c=b+a;
a=b;
b=c;
co++;
}
}
}
