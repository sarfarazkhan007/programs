import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
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
    	String sd[]=new String[n];
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
    	int numhold=0;
    	int dayshold=0;
    	int[] ar=new int[k-1];
    	int[] ar1=new int[k-1];
    	int[] ar2=new int[k-1];
    	int[] ar3=new int[k-1];
    	int[] days=new int[100];
    	int counter;	
  	
    	//if()

    	//System.out.println(Pattern.matches("[786]{1}[0-9]{9}", "9953038949"))

    	for(int row =1;row<k-1;row++)
    	{
    		for(int col=1;col<4;col++)
    		{
    			boolean val=qn[row][col].contains(".");
    			if(col==1 )
    			{
    				if(val)
	    			{
    					//while(Pattern.matches("[786]{1}[0-9]{9}", "9953038949"))
    					
	    				for(String s1 : qn[row][col].split("."))
	    				{
	    					
	    					days[dayshold++]=Integer.parseInt(s1);
	    				}
	    				for(int i=days[0];i<=days[1];i++)
					    	for(int r =1;r<k-1;r++)
					    	{
					    		if(Integer.toString(i).equals(sn[r][1]))
					    		{	
					    			ar[numhold++]=r;
					    		}
					    	}
	    				}	
    				else
    				{
    					for(int r =1;r<k-1;r++)
				    	{
				    		if(qn[row][col].equals(sn[r][1]))
				    		{	
				    			ar[numhold++]=r;
				    		}
				    	}
    					
    				}
    			}
  
    			else if(col==2)
    			{
    				numhold=0;
    				if(!val)
    				{
    					if(Pattern.matches("-1",q[row][col])){
    						ar1=ar;
    					}
    					else if ()  
    					{ 
    						for(int r : ar)
    						if(Pattern.matches(q[row][col]+"..",s[r][col]) || Pattern.matches(q[row][col],s[r][col]) )
    						{
    							ar1[numhold++]=r;
    						}

    					}
    				}
    				else
    				{
    					for(int r : ar)
    						if(Pattern.matches(q[row][col],s[r][col]) )
    						{
    							ar1[numhold++]=r;
    						}
    				}

    			}
    			else if(col==3)
    			{
    				numhold=0;
    				if(!val)
    				{
    					if(Pattern.matches("-1",q[row][col])){
    						ar2=ar1;
    						counter = ar2.length;

    					}
    					else if ()  
    					{
    						 
    						for(int r : ar1)
    						if(Pattern.matches(q[row][col]+"..",s[r][col]) || Pattern.matches(q[row][col],s[r][col]) )
    						{
    							ar2[numhold++]=r;
    							counter++;
    						}

    					}
    				}
    				else
    				{
    					for(int r : ar1)
    						if(Pattern.matches(q[row][col],s[r][col]) )
    						{
    							ar2[numhold++]=r;
    							counter++;
    						}
    				}
    			}
    		}
    		System.out.print(counter);
    		counter=0;
    	}

	}
}


