import java.util.Scanner;


public class SquareRoot {
	public static void main(String[] args) {
		 int c=0,i=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :-");
		a=sc.nextInt();
		
	while(c==0){
		c=divisor(++i,a);
	}
	System.out.println("the min divisor is " +c);
}
	
	static int divisor(int i, int a){
		int j;
		float div=(float)a/i;
		for(j=(int)Math.sqrt(div);j>0;j--){
			if(Math.sqrt(div)>j){
				return 0;
			}else if(Math.sqrt(div)==j){
	            return i;
			}
		}
		return 0;
	}
}