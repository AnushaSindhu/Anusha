import java.io.*;
import java.util.*;
class player1 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    StringBuffer  sb=new StringBuffer();
    sb.append(s);
    sb.reverse();
    System.out.println("The reversed string is" +" "+sb);
    }

}
