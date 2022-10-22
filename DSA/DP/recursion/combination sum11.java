
https://leetcode.com/problems/combination-sum-ii/submissions/


class Solution {
    
    static void fun(int i,List<List<Integer>> ans,int []a,int t,List<Integer> ds)
    {
          if(t==0)
        {
           if(!map.contains(new ArrayList<>(ds)))
                
            {
                map.add(new ArrayList<>(ds));
                   ans.add(new ArrayList<>(ds));
                return;
            }
           
        }
      
        for(int j=i;j<a.length;j++)
        {
             
            if(j>i && a[j]==a[j-1])
                continue; 
              if(a[j]>t)
              break;
            else
            {
                     ds.add(a[j]);
              fun(j+1,ans,a,t-a[j],ds);
           
              ds.remove(ds.size()-1);
            }
                
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] a, int k) {
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<>();
        Arrays.sort(a);
       
        
        fun(0,ans,a,k,l);
        
        return ans;
    }
}
