

https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int a[], int n) { 
        // Your code here
        long ans=0;
        int l[]=new int[n];
        int r[]=new int[n];
        int lmax=0, rmax=0;
        for(int i=1;i<n;i++)
        {
            if(a[i-1]>lmax)
            {
                lmax=a[i-1];
            }
            l[i]=lmax;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(a[i+1]>rmax)
            rmax=a[i+1];
            
            r[i]=rmax;
        }
        
        for(int i=1;i<n-1;i++)
        {
            int minlr=Math.min(l[i],r[i]);
            
            if(minlr>a[i])
            ans+=minlr-a[i];
        }
        return ans;
    } 
}


