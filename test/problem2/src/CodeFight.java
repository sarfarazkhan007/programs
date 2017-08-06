import java.util.Scanner;


public class CodeFight {

	public static void main(String[] args) {
		
		int n;
		String number; 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			if(i%5==0 && i%7==0){
				number="CodeFight";
			}else if(i%5==0){
				number="Code";
			}else if(i%7==0){
				number="Fight";
			}else{
				number=Integer.toString(i);
			}
			System.out.println(number);
			
		}

	}

}
