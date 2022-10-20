
https://practice.geeksforgeeks.org/problems/all-unique-permutations-of-an-array/1

class Solution {
    
     static void fun(ArrayList<Integer>a,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> l)
    {
        if(l.size()==a.size())
            ans.add(new ArrayList<>(l));
        
   for(int k=0;k<a.size();k++)
    {
       
      if(!l.contains(a.get(k)))
        {
        l.add(a.get(k));
        fun(a,ans,l);
        l.remove(l.size()-1);     
        }   
    }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> nums , int n) {
        // code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        fun(nums,ans,l);
        return ans;
    }
};
