import java.util.Scanner;
import java.util.Arrays;

public class Coins {

	public static void main(String[] args) {
			 int i,n,amt;
			 
			Scanner sc=new Scanner(System.in);
			System.out.print("Diff type of coin :-");
			n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(i=0;i<n;i++)
			   a[i]=sc.nextInt();
			
			System.out.print("Enter total amount ");
			Arrays.sort (a);
			amt=sc.nextInt();
			
			for(i=a.length-1;i>=0;i--){
				System.out.println(b[i]=amt/a[i]);
				amt-=a[i]*b[i];
			}
						
	}

}