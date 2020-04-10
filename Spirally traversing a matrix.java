import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int row = 0, col = 0, i = 0, j = 0;
            
            int arr[][] = new int[m][n];
            
            for(int k = 0; k < m; k++)
            {
                for(int l = 0; l < n; l++)
                 arr[k][l] = sc.nextInt();
            }
            
            while(row<m && col<n)
	   {
	       //Printing 1st row
	       for(i=col; i<n; i++)
	       {
	           System.out.print(arr[row][i] + " ");
	       }
	       row++;
	       
	       //Printing last col
	       for(i=row; i<m; i++)
	       {
	           System.out.print(arr[i][n-1] + " ");
	       }
	       n--;
	       
	       //Printing last row
	        if(row<m)
            {
                for(i=n-1; i>=col; --i)
                {
                    System.out.print(arr[m-1][i] + " ");
                }
                m--;
            }
	       
	       //Printing first col
	        if(col<n)
            {
                for(i=m-1; i>=row; --i)
                {
                    System.out.print(arr[i][col] +" ");
                }
                col++;    
            }   
	       
	   }
            
            System.out.println();
        }
    }
}