
https://leetcode.com/problems/permutations/
class Solution {
    
    static void fun(int []a,List<List<Integer>> ans,ArrayList<Integer> l)
    {
        if(l.size()==a.length)
            ans.add(new ArrayList<>(l));
        
   for(int j=0;j<a.length;j++)
    {
       
        if(!l.contains(a[j]))
        {
        l.add(a[j]);
        fun(a,ans,l);
        l.remove(l.size()-1);     
        }   
    }
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<>();
        fun(nums,ans,l);
        return ans;
    }
}
