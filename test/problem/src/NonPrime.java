import java.util.Scanner;

public class NonPrime{
	public static void main(String[] args) {
		
		int n,i=1,a=1,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		n=sc.nextInt();
		
		System.out.println("tne non prime divisors are :-");
		while(i<=n)
			{
			if(n%i==0){
				j=2;
				//a=1;
				if(i==1){
						a=0;
						}else{
							while(j<i){
								if(i%j==0){
									a=0;
								}
								j++;
									}
								}
				if(a==0){
					System.out.println(i);
					sum+=i;
				 a=1;
				}
			}
			i++;	
		}
		System.out.println("Sum of its non prime divisor "+sum);	
		}
}

