import java.io.*;
import java.util.*;

public class pro17 {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int n=0;
    int z=a;
    int x=1; 
    while(a>0)
    {
        n=a%10;
        x=x*n;
    	a=a/10;
    }
    int y=x*z;
    if(b==y)
    {
    System.out.println(b+" is a seed of "+z);
    }
    else
    {
    	System.out.println(b+" is not a seed of "+z);
    }
	}

}
