long long maxProduct(int *a, int l) {
	    // code here
	    long long int p=1,m=a[0],n=1;
	    for(int i=0;i<l;i++){
	        if(a[i]>0){
	            p*=a[i];
	            if(n*a[i]<1) n*=a[i];
	            else n=1;
	        }
	        else if(a[i]==0){p=1;n=1;}
	        else {long long int t=p;
	           if(n*a[i]>1) p=n*a[i];
	           else p=1; 
	           n=t*a[i];
	        }
	        if(p>m) m=p;
	    }
	   return m; 
	}
