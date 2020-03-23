#include <stdio.h>
int nextGap(int gap) 
{ 
    if (gap <= 1) 
        return 0; 
    return (gap / 2) + (gap % 2); 
} 
int main() {
    int t,n,m;
    scanf("%d",&t);
    while(t-->0){
        scanf("%d",&n);
        scanf("%d",&m);
        int arr1[n],arr2[m];
        for(int i=0;i<n;i++)
            scanf("%d",&arr1[i]);
        for(int i=0;i<m;i++)
            scanf("%d",&arr2[i]);
        int i, j, gap = n + m; 
        for (gap = nextGap(gap); gap > 0; 
             gap = nextGap(gap)) 
        { 
            for (i = 0; i + gap < n; i++) 
                if (arr1[i] > arr1[i + gap]) { 
                    int temp = arr1[i]; 
                    arr1[i] = arr1[i + gap]; 
                    arr1[i+gap] = temp; 
                } 
  
            for (j = gap > n ? gap - n : 0 ;  
                 i < n && j < m; i++, j++) 
                if (arr1[i] > arr2[j]) { 
                    int temp = arr1[i]; 
                    arr1[i] = arr2[j]; 
                    arr2[j] = temp; 
                } 
  
            if (j < m) 
            { 
                for (j = 0; j + gap < m; j++) 
                    if (arr2[j] > arr2[j + gap]) { 
                        int temp = arr2[j]; 
                        arr2[j] = arr2[j + gap]; 
                        arr2[j+gap] = temp; 
                    } 
            } 
        }
        for(i=0;i<n;i++)
            printf("%d ",arr1[i]);
        for(i=0;i<m;i++)
            printf("%d ",arr2[i]);
            printf("\n");
            
        
    }
	//code
	return 0;
}