import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gui4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        String sar[]=new String[q];
        for(int a0=0; a0 < q; a0++)
        	sar[a0]=in.next();
        for(String s:sar){
//            String s = in.next();
            // your code goes here
//           tf=check(s);
        	int sub=1;
           if(check(s,sub++)==true)
           	System.out.println("YES "+s.substring(0,1));
           else if(check(s,sub++)==true)
        	   System.out.println("YES "+s.substring(0,2));
        	   else if(check(s,sub++)==true)
            	   System.out.println("YES "+s.substring(0,3));
        	   else
        		   System.out.println("NO");
           }
        }
        
        
    
    static boolean check(String s,int s1){
    	int newnum[] =new int[s.length()];
    	int num=Integer.parseInt(s);
    	int div=2;
    	int counter=0;
    	int re1=num;
    	int re2=num;
    	int sub=s1;
    	int i=0;
//    	if(num/div==0){
//    		return false;
//    	}else{
    		while(div>1){
    			div=divcal(s.length(),sub);
    			re1=re2/div;
    			if(s1==2)
    			if(re1/10==0)
    				return false;
    			if(s1==3)
        			if(re1/100==0)
        				return false;
    			if(re1==9)
    				s1=2;
    			else if(re1==99)
    				s1=3;
    			sub=sub+s1;
//     			System.out.println(re1);
    		newnum[i]=re1;
    		re2=re2%div;
    		i++;
//    		System.out.println(div +" "+sub);
    		}
    		if(i==1)
    			return false;
    		for(int j=0;j<i-1;j++){
    			if(newnum[j+1]-newnum[j]==1)
    				++counter;
    		}
    			if(counter==i-1)
    				return true;
    			else 
    				return false;
    		}
//    }
    
    
    static int divcal(int s,int sub){
    	int div=1;
    	for(int i=0;i<s-sub;i++){
    		div=div*10;
    	}
    	return div;
    }
}




/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gui4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = in.nextInt();
        int result=0,lt=0,gt=0;
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
            if(score_i!=0)
            result=check(score,score_i);
            if(result==1)
              lt++;
            else if(result==2)
                gt++;
            
        }    
        
        System.out.println( gt +"  "+lt);
        // your code goes here
        
 
        }
    static int check(int score[],int i){
        int smaller=0,greater=0;   
        for(int j=0;j<i;j++){
            if(score[i]<score[j])
                smaller++;
            else if(score[i]>score[j])
                greater++;
                
           }
         if(smaller==i)
                return 1;
         else if(greater==i)
             return 2;
        return 0;
    }
    
}*/