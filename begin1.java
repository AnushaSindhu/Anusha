import java.io.*;
import java.util.*;
public class begin1
{
public static void main(String args[])
{
int x=5;
String a=Positive(x);
String b=Negative(x);
String c=Zero(x);
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
public static String Positive(int a)
{
if(a>0)
{
String Positive="Given number is positive";
return Positive;
}
return null;
}
public static String Negative(int a)
{
if(a<0)
{
String Negative="Given number is negative";
return Negative;
}
return null;
}
public static String Zero(int a)
{
if(a==0)
{
String Zero="Given number is zero";

return Zero;
}
return null;

}
}