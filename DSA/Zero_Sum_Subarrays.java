

                            https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
       HashMap<Long,Long> map=new HashMap<>();
       
       map.put(0l,0l);  //sum, freq
       long sum=0;
       long c=0;
       for(long x:arr)
       {
           sum+=x;
           if(map.containsKey(sum))
           {
               c+=map.get(sum)+1;
               map.put(sum,map.get(sum)+1);
           }
           else
           {
               map.put(sum,0l);
           }
           
       }
       return c;
       
    }
}
