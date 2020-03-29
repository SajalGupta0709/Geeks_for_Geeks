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
		    int c=-1,m=a[0];
		    for(int i=1;i<n-1;i++){
		        if(a[i]<m&& a[i]<c && c!=-1)  c=-1; 
		        else if(a[i]>=m){
		            if(c==-1){c=a[i]; m=a[i];}
		            else  m=a[i];}
		    }
		    if(c!=-1&& c>a[n-1]) c=-1;
		   System.out.println(c);
		}
	}
}