// Program to find minimum number of platforms 

import java.util.*; 

class GFG { 


// Driver program to test methods of graph class 
public static void main(String[] args) 
{ 	Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0){
    int n=s.nextInt();
 	int arr[]=new int[n];
  	int dep[]=new int[n];
 	for(int i=0;i<n;i++)
		 arr[i] = s.nextInt(); 
	for(int i=0;i<n;i++)
		 dep[i] = s.nextInt(); 
	Arrays.sort(arr); 
    Arrays.sort(dep); 
    int p= 1,r= 1; 
    int i = 1, j = 0; 
    while (i < n && j < n) 
    {  
	    if (arr[i] <= dep[j]) 
	    { 
	    	p++; 
	    	i++; 
		if (p > r) 
			r = p; 
	    } 
    	else
	    { 
		    p--; 
	    	j++; 
	    }    
        } 
	System.out.println(r); 
    } 
} 
}