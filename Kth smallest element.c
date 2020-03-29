{
	//code
	int t;
	scanf("%d",&t);
	while(t-->0){
	    int n,k;
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0;i<n;i++)
	      scanf("%d",&a[i]);
	    scanf("%d",&k);
	    qsort(a, n, sizeof(int), cmpfunc);
	    printf("%d\n",a[k-1]);
	    
	}
	return 0;
}