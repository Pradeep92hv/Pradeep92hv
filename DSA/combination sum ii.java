

                       https://practice.geeksforgeeks.org/problems/combination-sum-ii/1?problemStatus=unsolved&page=1&sortBy=newest&query=problemStatusunsolvedpage1sortBynewest




class Solution {
      static void fun(int i,List<List<Integer>> ans,int []a,int t,List<Integer> l)
    {
        if(t==0)
        {
            ans.add(new ArrayList<>(l));
                return;
        }
        
        for(int j=i;j<a.length;j++)
        {
            if(j>i && a[j]==a[j-1])
                continue;
            if(a[j]>t)
             break;
            
            
                  l.add(a[j]);
              fun(j+1,ans,a,t-a[j],l);
            l.remove(l.size()-1);
     
        }
        
    }
    public static List<List<Integer>> combinationSum2(int[] a, int k) {
          List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<>();
        Arrays.sort(a);
        fun(0,ans,a,k,l);
        return ans;
        
    }
}
