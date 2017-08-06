import java.util.*;
class fcfs{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int i,j,n,bt[],wt[],tat[],out[]; 
		System.out.println("Enter the number of process ");
		n=sc.nextInt();
		bt=new int[n+1];
		wt=new int[n+1];
		tat=new int[n+1];
		out=new int[n+1];
		float awt=0;
		float atat=0;

		System.out.println("Enter the burst time for each process");
		for(i=0;i<n;i++){
			System.out.println("Enter bt for process "+(i+1));
			bt[i]=sc.nextInt();
			out[i]=i+1;
		}
		for(i=0;i<n;i++){
		wt[i]=0;
		tat[i]=0;
		}

		int temp;
		for(i=0;i<n;i++){
			for(j=0;j<n-1;j++){
				if(bt[j]>bt[j+1]){
					temp=bt[j];
					bt[j]=bt[j+1];
					bt[j+1]=temp;

					temp=out[j];
					out[j]=out[j+1];
					out[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
		tat[i]=wt[i]+bt[i];
		wt[i+1]=tat[i];
		awt=awt+wt[i];
		atat=atat+tat[i];
		}


		System.out.println("Process  | bt     | wt    | tat");
		for(i=0;i<n;i++){
			System.out.println(out[i]+"\t | "+bt[i]+"\t | "+wt[i]+"\t | "+tat[i]);
		}
			awt=awt/n;
			System.out.println("*********************************************");
			System.out.println("Avg waiting time= "+awt);
			atat=atat/n;
			System.out.println("*********************************************");
			System.out.println("Avg turn around time= "+atat+"\n************************************");
	}
}
