#include <stdio.h>
int main() {
	//code
	int t,n,s;
	scanf("%d",&t);
	while(t-->0){
	scanf("%d",&n);
	scanf("%d",&s);
	int a[n],l=0,c=-1,sum=0;
	for(int i=0;i<n;i++)
	    scanf("%d",&a[i]);
	for(int i=0;i<n;i++){
	   sum+=a[i];
	   while(sum>s) sum-=a[l++];
	   if(sum==s) {
	       c=i+1;l+=1;break;
	   }
	}    
	if(c==-1) printf("-1\n");
	else printf("%d %d\n",l,c);
	}
	return 0;
}