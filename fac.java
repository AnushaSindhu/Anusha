import java.io.*;
import java.util.*;
class fac{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f=1;
int i;
for(i=n;i>=1;i--)
{
f=f*i;
}
System.out.println(f);
}
}