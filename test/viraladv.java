import java.io.*;
import java.util.*;

class Sol1 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int subs=5;

		for(int i=1;i<=n;i++)
		{
			subs = (int)Math.floor(subs/2);
			sum+=subs;
			subs*=3;
		}
		System.out.println(sum);
    }
}