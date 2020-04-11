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
		    String s=sc.next();
		    String s1="";
		    for(int i=s.length()-1;i>=0;i--){
		        if(s.charAt(i)!='.') s1+=s.charAt(i);
                else {
                    StringBuilder input1 = new StringBuilder(); 
                     input1.append(s1); 
                    input1 = input1.reverse(); 
                    System.out.print(input1+".");
                    s1="";
                }    
		    }
		    StringBuilder input1 = new StringBuilder(); 
                     input1.append(s1); 
                    input1 = input1.reverse(); 
                    System.out.println(input1);
		}
	}
}