import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int n=s.nextInt();
		    int m[]=new int[n];
		    int h[]=new int[n];
		    for(int j=0;j<n;j++)
		        m[j]=s.nextInt();
		    for(int j=0;j<n;j++)
		        h[j]=s.nextInt();      
		    Arrays.sort(m);
		    Arrays.sort(h);
		    int a=0;
		    for(int j=0;j<n;j++){
		        int x=Math.abs(m[j]-h[j]);
		        if(x>a) a=x;
		    }
		    System.out.println(a);
		    
		}
	}
}