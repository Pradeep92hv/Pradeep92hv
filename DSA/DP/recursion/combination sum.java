https://practice.geeksforgeeks.org/problems/combination-sum-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution
{
     static void solve(int i,ArrayList<Integer> a, int k,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds)
     {
         if(i==a.size())
         return ;
         if(k==0)
         ans.add(new ArrayList<>(ds));
         if(k<a.get(i))
         return;
          
         
         if(a.get(i)>k)
         return;
          
           if(a.get(i)<=k)
           {
                ds.add(a.get(i));
           solve(i,a,k-a.get(i),ans,ds);
           
              ds.remove(ds.size()-1);
           }
           
           
          solve(i+1,a,k,ans,ds);
     }
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
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
      
      solve(0,a,target,ans,ds);
     
        return ans;
    }
}
