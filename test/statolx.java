import java.io.*;
import java.util.*;
import java.text.*;
import java.math	.*;
import java.util.regex.*;

class Olx 
{
	static int n;
	static String input[]=new String[n];
	static String qn[][]=new String[n][4];
   	static String sn[][]=new String[n][4];

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
    	int j=0,k=0;
   		
    	// String input[][]=new String[n][4];
    	
    	//char q[]=new char[n];
    	// String qn[]=new String[n];
    	// String qd[]=new String[n];
    	// String qpc[]=new String[n];
    	// String qsr[]=new String[n];

    	// String sn[]=new String[n];
    	// String sd[]=new String[n];
    	// String spc[]=new String[n];
    	// String ssr[]=new String[n];    	    	
    	
    	//char s[]=new char[n];
    	sc.nextLine();
    	for(int i=0;i<n;i++)
    	{
    		input[i]=sc.nextLine();

    		if(input[i].startsWith("Q"))
    		{
    			int col=0;
    			for(String temp1:input[i].split("\\s",0))
    			{
    				qn[j][col]=temp1;
    				col++;	
    			}
    			j++;
    		}
    		else
    		{
    			int col=0;
    			for(String temp1:input[i].split("\\s",0))
    			{
    				sn[k][col]=temp1;
    				col++;	
    			}
    			k++;
    		}

    	}

    	/*if()

    	System.out.println(Pattern.matches("[786]{1}[0-9]{9}", "9953038949"))

    	for(int row =1;row<k-1;row++)
    	{
    		for(int col=1;col<4;col++)
    		{
    			boolean val=qn[row][col].contains(".");
    			if(col==1 && val)
    			{
    				for(String s1:qn[row][col].split("."))
    				{
    					String start=s1;

				    	for(int r =1;r<k-1;r++)
				    	{
				    		if(s1==sn[r][col])
				    		{	
				    			checkPC(r,);
				    		}
				    	}

    				}	

    			}
    			else if(val)
    			{
    				qn[]

    			}
    		}
    	}


    	for (String [] x : qn)
		{
			// System.out.print(x + " ");
		   for (String y : x)
		   {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}

 		System.out.println(Arrays.deepToString(qn));
 		System.out.println(Arrays.deepToString(sn));

    	System.out.println("\n end");

*/
    }
    static boolean checkPoint(int c,String sub)
    {
    	return sub.contains(".");
    }
}
	