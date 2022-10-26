https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1


class Solution{
static int subsetSumUtil(int ind, int target,int arr[],int[][] dp){
    if(target==0)
        return 1;
    
    if(ind< 0)
        return 0;
    
    if(dp[ind][target]!=-1)
        return dp[ind][target];
        
    int notTaken = subsetSumUtil(ind-1,target,arr,dp);
    
    int taken =0;
    if(arr[ind]<=target)
        taken = subsetSumUtil(ind-1,target-arr[ind],arr,dp);
      return  dp[ind][target]=Math.max(notTaken,taken);
    
}
    static int equalPartition(int n, int arr[])
    {
        // code here
        int sum=0;
        for(int a:arr)
        sum+=a;
        
        if(sum%2==1)
        return 0;
        else{
            int dp[][]=new int [n][(sum/2)+1];
           for(int row[]: dp)
          Arrays.fill(row,-1);
      return subsetSumUtil(n-1,sum/2,arr,dp);
       
      
        }
        
    }
}
