
          https://leetcode.com/problems/subsets-ii/


class Solution {
    static void fun(int i,int []a,List<List<Integer>> ans,ArrayList<Integer> l)
    {
        ans.add(new ArrayList<>(l));
        
    for(int j=i;j<a.length;j++)
    {
        if(j>i && a[j]==a[j-1])
            continue;
        
        l.add(a[j]);
        fun(j+1,a,ans,l);
        l.remove(l.size()-1);
      
        
    }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,ans,l);
        
     return ans;
    }
}
