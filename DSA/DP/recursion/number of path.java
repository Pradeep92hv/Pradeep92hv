
https://practice.geeksforgeeks.org/problems/number-of-paths0926/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution{
    static long solve(int i, int j)
    {
        if(i==0 && j==0) return 1;
        if(i<0 || j<0)  return 0;
        
        long up=solve(i-1,j);
        long right=solve(i,j-1);
        
        return (long)(up+right);
    }
    
    long numberOfPaths(int m, int n) {
        // Code Here
    return    solve(m-1,n-1);
    }
    
}
