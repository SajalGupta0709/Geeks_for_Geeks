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
		{   int c=0;
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		        {a[i]=sc.nextInt(); a[i]*=a[i];}
		    if(n>2){  
		    Arrays.sort(a);
		    for(int i=n-1;i>=2;i--){
		        int l=0,r=i-1;
		        while(l<r){
		            if(a[l]+a[r]==a[i]){c++; break;}
		            else if(a[l]+a[r]<a[i]) l++;
		            else r--;
		        }
		        if(c==1) break;
		    }
		    }
		    if(c==1) System.out.println("Yes");
		    else System.out.println("No");
		}
	}
}