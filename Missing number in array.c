#include <stdio.h>
int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}
int main() {
	//code
	int t,n;
	scanf("%d",&t);
	while(t-->0){
	    scanf("%d",&n);
	    int i,f=0,c=0;
	    int a[n];
	    for(i=0;i<n-1;i++)
	        scanf("%d",&a[i]);
	        qsort(a, n-1, sizeof(int), cmpfunc);
	         for(int i=0;i<n-1;i++){c++;
	        if(c!=a[i]) {f=1;break;}}
	        if (f==0) c=n;
	    printf("%d\n",c);
	}
	return 0;
}