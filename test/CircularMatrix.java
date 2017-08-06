import java.util.*; 

class CircularMatrix
{
 	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		int[] x = new int[15];  //array for valuecof x(n)
		int[] h = new int[15];	//array for valuecof h(n)
		int[] y = new int[15];	//array for valuecof y(n)
		int i=0; //no of x samples counter i.e length
		int j=0; //no of h samples counter i.e length
		int count=0; //counter to maintain circular matrix same as i 


		System.out.println(" ----------------------------------------------------");
		System.out.println("|		PEROIDIC SIGNALING		     |");
		System.out.println(" ----------------------------------------------------");
		System.out.println("| 	 USING CIRCULAR MATRIX METHOD 		     |");
		System.out.println(" ----------------------------------------------------");

		
		System.out.println();
		System.out.print("Enter all samples leaving space of x(n): ");
		String xsample=sc.nextLine();  //taking value of x(n) as a string 
		System.out.println(" ----------------------------------------------------");
		System.out.println();
		for(String w:xsample.split("\\s")) //spliting according to space
		{  
			x[i++]=Integer.parseInt(w); // after spliting covert val of x(n) into integer array
		}
	
		System.out.print("Enter all samples leaving space of h(n): ");
		String hsample=sc.nextLine();//taking value of h(n) as a string
		System.out.println(" ----------------------------------------------------");
		System.out.println();
		for(String w:hsample.split("\\s"))//spliting according to space 
		{  
			h[j++]=Integer.parseInt(w); //after spliting covert val of h(n) into integer array
		} 

		// For padding 0's
		if(i!=j)
		{
			if(j < i) //if length of x(n) is greater pad val of h(n) with 0's
			{ 
				for (int start = j ; start < i ; start++)
				{ 
					h[start] = 0;
				}
				j=i;
			}
			else  //if length of h(n) is greater pad val of h(n) with 0's
			{
				for (int start = i ; start < j ; start++) 
				{ 
					x[start] = 0;
				}
				i=j;		
			}
		}	

		int[][] xmatrix = new int [i][j]; //array for circular matrix of x(n)

		//code to convert x(n) into circluar matrix 
		for(int row = 0;row<i;row++)
		{
			for(int col=0;col<i;col++)
			{
				if(i<=count)
				{
					count=0;
				}
				else
				{
					xmatrix[col][row]=x[count++];
					if(i== count || count >i)
					{
						count=0;
					}
				}
			}
			count = i-row-1;
		}

		System.out.println();
		
		//calculating value of y(n)
		for(int row =0;row<i;row++)
		{
			for(int col=0;col<i;col++)
			{
				y[row]+=xmatrix[row][col]*h[col];
			}	
		}

		//Printing matrix circular formuale with values circularMatrix(x(n)) * h(n) = y(n)
		for(int row =0;row<i;row++)
		{
			System.out.print("| ");
			for(int col=0;col<i;col++)
			{
				System.out.print(xmatrix[row][col]+"  ");
			}
			System.out.print("| | ");
			System.out.print(h[row]+" | = | "+ y[row] +" |");
			System.out.println();
		}
		System.out.println();		
		System.out.println();
		System.out.print("main answer after convolution : ");

        
		//Printing value of y(n) i.e main answer
        String answer="{ ";
        for(int row =0;row<i;row++)
        {
            answer+=y[row]+" ";
        }
		System.out.print(answer +" }");
		System.out.println();
		System.out.println();
	}
}
