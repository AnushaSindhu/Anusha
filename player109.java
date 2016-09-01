package player109;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class player109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    StringBuffer sb=new StringBuffer(a);
    StringBuffer sbb=new StringBuffer();
    Set s1=new HashSet();
    sb.reverse();
    if(a.equals(sb.toString()))
    {
    	char[] ch=a.toCharArray();
    	
    for(int i=0;i<ch.length;i++)
    {
    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
    {
    	sbb.append(ch[i]);
    }
    }
    String s=sbb.toString();
   // System.out.println(s);
    char[]  chh=s.toCharArray();
   for(int j=0;j<chh.length;j++)
    	    {
    	     s1.add(chh[j]);
    	    }
   //System.out.println(s1);
   if(s1.size()>=2)
   {
	  
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    		
    	}
    }
    else
    {
    	System.out.println("Given String is not a palindrome");
    }
	
}
}


