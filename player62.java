package player62;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%2!=0)
    {
    	System.out.println(1);
    }
    else
    for(int i=1;i<a;i++)
    {
    int b=a/i;
    if(b%2==0)
    {
    	continue;
    }
    else
    {
    if(b%2!=0)
    {
    System.out.println(i);
    break;
    }
    }
    }
	}

}
