import java.util.Scanner;

public class player28{

	public static void main(String[] args) {
		Justify j=new Justify();
		j.align();
	}
}
class Justify
{
	public void align()
	{
		Scanner sc=new Scanner(System.in);
		String s1[]={"this","is","an","example","of","text","justification"};
		int l=s1.length;
		int i=0;
		int count=16;
for(i=0;i<l;i++)
{
	int n=s1[i].length();
	if(n<count)
	{
		System.out.print(s1[i]+ " ");
		count =count-(n+1);
	}
	else
	{
		System.out.print("\n"); 
		count=16;
		System.out.print(s1[i]+ " ");
		count=count-(n+1);
	}
}
}}	