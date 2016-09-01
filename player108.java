package player108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    //TreeSet ts=new TreeSet();
    StringBuffer sb=new StringBuffer();
    HashMap<Character,Integer> it=new HashMap<>();
    
    for(int i=0;i<a.length();i++)
    {
    Character current=a.charAt(i);
    Integer p=it.get(current);
    //System.out.println(p);
    if(p==null)
    it.put(current, 1);
    else
    	it.put(current,p+1);
    	
    }
   // System.out.println(it);
    for(int i=0;i<a.length();i++)
    {
    Character current=a.charAt(i);
    Integer p=it.get(current);
    if(p==1)
    	sb.append(current);
    }
    	System.out.println(sb.length());
	}
	
}