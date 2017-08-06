import java.util.*;
class disk{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	    int n,i,total=0;
		
		System.out.println("Enter the number of request ");
		n=sc.nextInt();
		
		int c[]=new int[n];
		int hm[]=new int[n];
		int out[]=new int[n];

		for(i=0;i<n;i++){
		System.out.println("enter track number ");
		c[i]=sc.nextInt();
		out[i]=i+1;
		}

		System.out.println("enter heads start ");
		int hs=sc.nextInt();		

		for(i=0;i<n;i++){
			if(c[i]>hs){
				hm[i]=c[i]-hs;
				hs=c[i];
			}else{
				hm[i]=hs-c[i];
				hs=c[i];
			}
			total=total+hm[i];
		}
		
		System.out.println("Total head movements "+total);
  }
}
