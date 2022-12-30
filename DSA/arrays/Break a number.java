https://practice.geeksforgeeks.org/problems/break-a-number5913/0class Solution{
    int waysToBreakNumber(int N){
        // code here
          int mod = 1000000007;

        long ans = N%mod;
    
        ans=(ans*(ans+1)/2)%mod-3;
       
       ans=(ans+6)%mod;
    ans=(ans-2+(long)N)%mod;
        

        return (int)ans;
        
       // s+6+n-2
    }
}
