https://leetcode.com/problems/contiguous-array/submissions/


class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0,lg=0;
        map.put(c,-1);  // count, index
        
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(a==1)
                c++;
            else
                c--;
            
            if(map.containsKey(c))
            {
                int l=i-map.get(c);
                lg=Math.max(l,lg);
            }
            else
            {
             map.put(c,i);   
            }
        }
        return lg;
    }
}
