#include <stdio.h>
int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}

int main() {
	//code
	int t,n;
	scanf("%d",&t);
	while(t-->0)
	{
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0;i<n;i++)
	        scanf("%d",&a[i]);
	    int c=0,f=0,l;
	    qsort(a, n, sizeof(int), cmpfunc);
	    for(int i=n-1;i>=0;i--){l=i-1; f=0;
	    while(f<l)
	    {
	        if(a[f]+a[l]==a[i]) {c++; l--;f++;}
	        else if(a[f]+a[l]<a[i]) f++;
	        else l--;
	    }}
	    if(c==0) printf("-1\n");
	    else
	    printf("%d\n",c);
	}
	
	return 0;
}