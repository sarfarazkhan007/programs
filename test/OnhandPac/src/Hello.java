import java.util.Scanner;
public class Hello 
{
	public static void main(String[] args) 
	{
		int a,n,c=0,p=0,csum=0,psum=0,ps=0,cs=0;
		Scanner sc=new Scanner(System.in);
//		System.out.print("type the first smallest number = ");
		a=sc.nextInt();
//		System.out.print("type the second larger number = ");
		n=sc.nextInt();
		
		for(int i=a;i<=n;i++)
		{
			if(i==2 || i==3)
			{
				ps+=i;
			}
			else
			{
				for(int j=2;j<=i/2;j++)
				{		
					if(i%j==0)
					{
						cs+=i;
	 					break;
					}
					else if(j==(int)i/2)
					{
						ps+=i;
						break;
					}
				}
			}
     	}
			System.out.print(Math.abs(ps-cs));
	}
}

/*
clASS is template of abstract things

if you have a public class in a sourcecode then save it 
with that class name compulsory

main method and static key word are syntactically not required but 
logically required
*/


//path:-  Desktop/AllDesktop/javaprogram/test/GUI/src