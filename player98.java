import java.io.*;
import java.util.*;
class player98
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int[] b=new int[c];
for(int i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
}
int s=sc.nextInt();
for(int i=0;i<4;i++)
{
if(b[i]==s)
{
System.out.print("true");
break;
}
else
{
System.out.print("false");
break;
}
}
}
}




