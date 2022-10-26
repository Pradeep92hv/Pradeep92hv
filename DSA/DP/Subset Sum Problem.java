https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution{

    static boolean subsetSumUtil(int ind,int target,int []arr,int dp[][])
    {
        if(target==0)
        return true;
    
    if(ind< 0)
        return false;
    
    if(dp[ind][target]!=-1)
        return dp[ind][target]==0?false:true;
        
    boolean notTaken = subsetSumUtil(ind-1,target,arr,dp);
    
    boolean taken = false;
    if(arr[ind]<=target)
        taken = subsetSumUtil(ind-1,target-arr[ind],arr,dp);
        dp[ind][target]=notTaken||taken?1:0;
    return notTaken||taken;
        
    }

    static Boolean isSubsetSum(int n, int arr[], int k){
        // code here
        int dp[][]=new int[n][k+1];
    for(int []x:dp)
      Arrays.fill(x,-1);
        return subsetSumUtil(n-1,k,arr,dp);
    }
}
