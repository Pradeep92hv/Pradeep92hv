https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/0

class Solution {
   static boolean pos(int []time,int n,int m,int mid){
        int c=1;
        int t=0;
        
        for(int i=0;i<n;i++)
        {
          
          
           if(t+time[i]>mid)
           {
               c++;
               t=time[i];
               
               if(c>m)
               return false;
           }
           else
           t+=time[i];
        }
        return true;
    }

    //Function to find minimum number of pages.
    public static int findPages(int[]time,int n,int m)
    {
        //Your code here
        if(n<m)
        return -1;
         int s=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=time[i];
        }
        int e=sum;
        int ans=-1;
    
        
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(pos(time,n,m,mid))
            {
                ans=mid;
                e=mid-1;
            }else
            {
                s=mid+1;
            }
          //  mid=s+(e-s)/2;
        }
        return ans;
    }
};
