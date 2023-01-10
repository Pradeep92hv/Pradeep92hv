https://practice.geeksforgeeks.org/problems/6e63df6d2ebdf6408a9b364128bb1123b5b13450/1



class Solution {
    public long minIncrements(int[] a, int n) {
        // Code here
        HashSet<Integer> s=new HashSet<>();
       int c=0;
       ArrayList<Integer> al=new ArrayList<>();
        for(int x:a)
        {
            if(!s.contains(x))
            s.add(x);
            else
            al.add(x);
        }
     
      for(int i=0;i<al.size();i++)
      {
        while(s.contains(al.get(i)))
          {
              c++;
              al.set(i,al.get(i)+1);
          }
          s.add(al.get(i));
       
      }
        
        return c;
        
    }
}
