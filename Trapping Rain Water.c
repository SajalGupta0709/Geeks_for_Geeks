#include<stdio.h>
#include<math.h>

#include<stdlib.h>
int main()
{
	//code
	int t;
	scanf("%d",&t);
	while(t-->0){
	    int n;
	    scanf("%d",&n);
	    int l[n],r[n],a[n];
	    for(int i=0;i<n;i++)
	      scanf("%d",&a[i]);
	        l[0]=a[0];
		    for(int i=1;i<n;i++)
		        l[i]=a[i]>=l[i-1]?a[i]:l[i-1];
		    r[n-1]=a[n-1];      
		    for(int i=n-2;i>=0;i--)
		        r[i]=r[i+1]>=a[i]?r[i+1]:a[i];
		    int w=0;
		    for(int i=0;i<n;i+=1)
		        w+=(l[i]<=r[i]?l[i]:r[i])-a[i];
	      printf("%d\n",w);
	}
	return 0;
}