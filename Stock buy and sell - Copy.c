#include<stdio.h>
int main()
{
	//code
	int t;
	scanf("%d",&t);
	while(t-->0){
	    int n;
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0;i<n;i++)
	      scanf("%d",&a[i]);
	    int c=0,l=-1,f=0;
	    for(int i=0;i<n;i++){
	        if(i==n-1)
	            {if(c==1) {printf("(%d %d) ",l,i); f=1;}
	             continue;}
	        if(a[i]<a[i+1])
	            {if(c==0){ l=i; c=1;} }
	       else {if(c==1){printf("(%d %d) ",l,i);
	            c=0; f=1;
	       } }
	    }
	    if(f==0) printf("No Profit\n");
	    else printf("\n");
	}
	return 0;
}