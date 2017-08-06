import java.io.*;
import java.util.*;

class Solution 
{
    public static void main(String[] args) 
    {
    	int n;
    	int a=0;
    	int b=0;
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and last date and the k value: ");
        int i=sc.nextInt();
  		int j=sc.nextInt();
  		int k=sc.nextInt();
  		int[] reverse=new int[j-i+1];
  		int[] days=new int[j-i+1];
  		Arrays.fill(reverse,0);
  		for(int i1=i;i1<=j;i1++)
  		{
  			days[b]=n=i1;
  			while( n != 0 )
		        {
		            reverse[b] = reverse[b] * 10;
		            reverse[b] = reverse[b] + n%10;
		            n = n/10;
		        }
		        b++;
  		}
  		// System.out.println("Reverse of entered number is "+reverse);

  		b=0;

  		for(int i1=i;i1<=j;i1++)
  		{
  			if((days[b]-reverse[b])%k==0)
  				a++;
  			b++;
  		}
  		System.out.println(a);
    
    }
}