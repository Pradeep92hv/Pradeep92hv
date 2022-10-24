https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article



class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the functiop
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0,rem=0,l=0;
        
        map.put(0,-1);
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            rem=sum%k;
            if(rem<0)
            rem+=k;
            if(map.containsKey(rem))
            {
                l=Math.max(l,i-map.get(rem));
                
            }
            else
            map.put(rem,i);
            
        }
     return l;  
    }
 
}
