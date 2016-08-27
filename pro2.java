import java.util.*; 
import java.lang.*; 
 class pro2
{ 
  public static void main(String args[]) 
   { 
    Scanner sc=new Scanner(System.in); 
    String s=sc.next(); 
    int a=sc.nextInt(); 
    char arr[]=s.toCharArray(); 
    Arrays.sort(arr); 
     StringBuffer sb=new StringBuffer(); 
     for(int i=0;i<arr.length-a;i++) 
     { 
       sb.append(arr[i]); 
     } 
     System.out.println(sb.toString()); 
      
   } 
 } 
