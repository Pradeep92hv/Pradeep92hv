

                                        https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        
        if(nums.length%2!=0)
         return false;
        int a[]=new int[k];
        
        for(int x:nums)
        {
            a[x%k]++;
        }
        
        for(int i=1;i<k;i++)
        {
            if(a[0]%2==1)
            return false;
       
           if(a[i]!=a[k-i])
            return false;   
          
           
        }
        
        return true;
        
        
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int x:nums)
        // {
        //     int r=x%k;
            
        //     int f=map.getOrDefault(r,0);
        //     map.put(r,f+1);
        // }
        // for(int x:nums)
        // {
        //     int r=x%k;
            
        //     if(r==0)
        //     {
        //         int f=map.get(r);
        //         if(f%2!=0)
        //         return false;
        //     }
        //     else if(2*r==k)
        //     {
        //          int f=map.get(r);
        //          if(f%2==1)
        //          return false;
        //     }
        //     else
        //     {
        //           int f=map.get(r);
        //           int f1=map.get(k-r);
        //           if(f!=f1)
        //             return false;
        //     }
        // }
        // return true;
    }
}
