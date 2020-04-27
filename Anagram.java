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
    	    String s=sc.next();
    	    String s1=sc.next();
    	    if(s.length()!=s1.length()) {System.out.println("NO"); continue;}
    	    int f[]=new int[26];
    	    for(int i=0;i<26;i++)   f[i]=0;
    	    for(int i=0;i<s.length();i++){
    	        int ch=s.charAt(i)-'a';
    	        f[ch]++;
    	    }int z=0;
    	    for(int i=0;i<s1.length();i++){
    	        int ch=s1.charAt(i)-'a';
    	        if(f[ch]>0) f[ch]--;
    	        else{ z=1;break;}
    	    }
    	    if(z==1) System.out.println("NO");
    	    else System.out.println("YES");
	  }
	}
}