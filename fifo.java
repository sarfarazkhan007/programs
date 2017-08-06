import java.util.*;
class fifo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	int i,n;
	int fifo[]=new int[4];
	
	System.out.println("Enter the number of process :- ");
	n=sc.nextInt();
	
	int inpt[]=new int[n+1];
	
	for(i=0;i<n;i++){
		System.out.println("process size");
	inpt[i]=sc.nextInt();
	}
	
	for(i=0;i<3;i++){
	 fifo[i]=-1;
	}
	
	int j=0,hit=0,fault=0,k;
	boolean check;
	
	for(i=0;i<n;i++){
	check=false;
	for(k=0;k<3;k++)
	if(fifo[k]==inpt[i]){
		check=true;
		hit=hit+1;
	}
	if(check==false){
		fifo[j]=inpt[i];
		j++;
		if(j>=3)
		   j=0;
		   fault=fault+1;
	}
	}	
	System.out.println("Fault "+fault+"  hit "+hit);
	}
}
 

