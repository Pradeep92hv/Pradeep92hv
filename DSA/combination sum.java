    here 2 qus are diff but almost same concept
    
    https://practice.geeksforgeeks.org/problems/combination-sum-1587115620/1
    
    class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static void fun(int i,ArrayList<Integer> a,int k,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans)
    {
       if(i==a.size())
       return;
         if(k==0)
         {
             ans.add(new ArrayList<>(ds));
             return;
             
         }
         if(a.get(i)>k)
         return;
         
    if(a.get(i)<=k)
    {
       
        ds.add(a.get(i));
          fun(i,a,k-a.get(i),ds,ans);
        ds.remove(ds.size()-1);
        
    }
   fun(i+1,a,k,ds,ans);
    
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> c, int target)
    {
        // add your code here
           ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
           HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<c.size();i++)
                set.add(c.get(i));
             ArrayList<Integer> a=new ArrayList<>();
             for(int x:set)
               a.add(x);
           Collections.sort(a);
         ArrayList<Integer> ds=new ArrayList<>();
      
      fun(0,a,target,ds,ans);
     
        return ans;
    }
}





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
