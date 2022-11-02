https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{
    static int solve(int x, int y, String s1,String s2,int dp[][])
    {
        if(x<0 || y<0) return 0;
        if(dp[x][y]!=-1) return dp[x][y];
        int same=0,not=0;
        if(s1.charAt(x)==s2.charAt(y))
         same=1+solve(x-1,y-1,s1,s2,dp);
        else
        not=Math.max(solve(x-1,y,s1,s2,dp),solve(x,y-1,s1,s2,dp));
        return dp[x][y]=same+not;
    }
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int[x][y];
        
        for(int p[]:dp)
        Arrays.fill(p,-1);
        return solve(x-1,y-1,s1,s2,dp);
    }
    
}
