#include <stdio.h>
#include <math.h>
int max(int num1, int num2)
{
    return (num1 > num2 ) ? num1 : num2;
}
int main() {
	//code
	int t,n;
	scanf("%d",&t);
	while(t-->0){
	    scanf("%d",&n);
        int a[n];
	    for(int i=0;i<n;i++)
	        scanf("%d",&a[i]);
	       int maximum = a[0]; 
   int current = a[0]; 
  
   for (int i = 1; i < n; i++) 
   { 
        current = max(a[i], current+a[i]); 
        maximum = max(maximum, current); 
   } 
	   printf("%d\n",maximum);
	}
	return 0;
}