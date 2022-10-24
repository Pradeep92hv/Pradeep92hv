https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution
{
    static int findSubArraySum(int a[], int n, int k)
    {
        // code here
          HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0,rem=0,l=0;
        
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(map.containsKey(sum-k))
            {
                l+=map.get(sum-k);
                //map.put(rem,map.getOrDefault(sum,0)+1);
            }
           
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
     return l;  
        
    }
}
