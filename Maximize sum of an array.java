import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		        a[j]=sc.nextInt();
		    Arrays.sort(a);
		    int s=0;
		    for(int j=0;j<n;j++)
		        s=(s+(j*a[j])%1000000007)%1000000007;
		        s%=1000000007;
		      System.out.println(s);  
		}
	}
}