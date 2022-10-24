https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/0
class Solution
{
    static int step(int i,int n,int []dp)
    {   
        
        if(n==i) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=(step(i+2,n,dp)+step(i+1,n,dp))%1000000007;
    }
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return step(0,n,dp);
    }
}
