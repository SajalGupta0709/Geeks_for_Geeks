#include<stdio.h>
int main()
{
	//code
	int t;
	scanf("%d",&t);
	while(t-->0){
	    int n;
	    scanf("%d",&n);
	    int a[n],r[n],j=0,m;
	    for(int i=0;i<n;i++)
	        scanf("%d",&a[i]); 
	    m=a[n-1];
	    for(int i=n-1;i>=0;i--){
	      if(m<=a[i]) {m=a[i]; r[j++]=a[i];}
	    }
	    for(int i=j-1;i>=0;i--)
	        printf("%d ",r[i]);
	    printf("\n");
	}
	return 0;
}