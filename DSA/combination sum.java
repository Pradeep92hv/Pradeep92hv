https://leetcode.com/problems/combination-sum/submissions/

class Solution {
    static void fun(int i,int []arr,int target, 
                   List<List<Integer>> ans,List<Integer> ds)
    {
        
      if(i==arr.length)
      {
          if(target==0)
              
          {
              ans.add(new ArrayList<>(ds));
          }
          return ;
      }
        
        if(arr[i]<=target)
        {
            
          ds.add(arr[i]);
            fun(i,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
            
        }
        fun(i+1,arr,target,ans,ds);;
        
        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        fun(0,candidates,target,ans,ds);
        return ans;
    }
}
