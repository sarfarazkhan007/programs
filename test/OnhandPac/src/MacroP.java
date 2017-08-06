import java.io.BufferedReader;
import java.io.FileReader;


public class MacroP {

	public static void main(String[] args) throws Exception 
	{
		    FileReader fr=new FileReader("macro.txt"); 
		    BufferedReader br=new BufferedReader(fr); 
		    String s,l; 
		    String program[]=new String[100];
		    String label[]=new String[100];
		    // int[] LOC=new int[15]; 
		    int N=0,j/*,n=0,stmt=0,LOC=0,locn=0,j,i*/;
		    
		    System.out.println("Assembly lang program :\n--------------------------");
		    while((s = br.readLine()) != null)
		    {
		        program[N++]=s;
		        System.out.println(s); 
//			 System.out.println(N);
		    } 
		    fr.close();
		    for(j=0;j<N;j++)
		    System.out.println(program[j]);
		

	}
}
