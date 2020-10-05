int maxLen(int a[], int n)
{
    // Your code here
    unordered_map<int,int> mp;
    int s=0,ml=0;
    for(int i=0;i<n;i++){
        s+=a[i];
        if(s==0) ml=i+1;
        else{
            if(mp.find(s)!=mp.end())
                ml=max(ml,i-mp[s]);
            else mp[s]=i;    
        }
    }

    return ml;
}
