

                        https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class GfG
{
    int maxLen(int a[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int l=0;
        map.put(sum,-1);  //sum , index
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            
            if(map.containsKey(sum))
           {
                 int l2=i-map.get(sum);
                 
                 l=Math.max(l,l2);
           }
           else
           {
               map.put(sum,i);
           }
             
        }
        return l;
    }
}
