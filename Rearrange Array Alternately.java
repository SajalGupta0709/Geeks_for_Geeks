/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=sc.nextInt();
		    Arrays.sort(a);
            int i,j;
		    for(i=0, j=n-1;i<j;i++,j--)
		        System.out.print(a[j]+" "+a[i]+" ");
		       if(i==j) System.out.print(a[j]);
		    System.out.println();
		}
	}
}