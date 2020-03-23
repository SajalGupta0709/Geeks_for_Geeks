#include <stdio.h>

int main() {
	//code
	int t;
	scanf("%d",&t);
	while(t-->0)
	 {
	    int n,l=0;
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0;i<n;i++)
	       { scanf("%d",&a[i]); l+=a[i];}
	    l-=a[0];
	    int i,d=0,f=a[0]; 
	    if(n==1){printf("1\n"); continue;}
	   for(i=1;i<n-1;i++)
	   {    l-=a[i];
	       if(f==l) {i++;d=1;break;}
	       f+=a[i];
	   }
	   if(d==1)
	   printf("%d\n",i);
        else 
        printf("-1\n");
	     
	 }     
	return 0;
}