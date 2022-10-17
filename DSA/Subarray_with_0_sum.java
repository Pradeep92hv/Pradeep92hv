
  https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article



class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int a[],int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int l=0;
        map.put(sum,-1);  //sum , index
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            
            if(map.containsKey(sum))
           {
               return true;
                 
                
           }
           else
           {
               map.put(sum,i);
           }
             
        }
        return false;
    }
}
