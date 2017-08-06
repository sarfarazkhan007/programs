import java.util.Scanner;
import java.util.Random;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int n;
		System.out.println("enter the matrix size");
		n=sc.nextInt();
		int[][] a=new int[n][n];
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if((i-1)==-1 || (j-1)==-1 ){
				a[i][j]=1+rn.nextInt(9);
			}else if(i!=0 || j!=0){
				a[i][j]=a[i-1][j-1];
				}
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}
