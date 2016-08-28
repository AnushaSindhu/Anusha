import java.io.*;
import java.util.*;
 class player3
{
    public static void main(String args[])
 {      
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] a={1,5,10,50,100,500,1000};
        if(s != null && !s.equals("") && s.length()==1)
           {
                   
                    if(s.equals("I"))
                    {
                    System.out.print(a[0]);
                    } 
                    else if(s.equals("V"))
                    {
                    System.out.print(a[1]);
                    } 
                    else if(s.equals("X"))
                    {
                    System.out.print(a[2]);
                    } 
                    else if(s.equals("L"))
                    {
                    System.out.print(a[3]);
                    } 
                    else if(s.equals("C"))
                    {
                    System.out.print(a[4]);
                    } 
                    else if(s.equals("D"))
                    {
                    System.out.print(a[5]);
                    } 
                    else if(s.equals("M"))
                    {
                    System.out.print(a[6]);
                    }
                    else
                    {
                    System.out.print("invalid roman");
                    }
                    } 
                    
}
}
                
      
                   

