/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=sc.nextInt();
		    int k=sc.nextInt();
		    Arrays.sort(a);
		    int d=a[n-1];
		    for(int i=k-1;i<n;i++){
		        d=Math.min(a[i]-a[i-k+1],d);
		    }
		    System.out.println(d);
		}
		
	}
}