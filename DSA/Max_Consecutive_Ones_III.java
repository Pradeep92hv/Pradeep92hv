
              https://leetcode.com/problems/max-consecutive-ones-iii/submissions/


class Solution {
    public int longestOnes(int[] nums, int k) {
        
       int c=0,l=0,j=0;
        int start=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                c++;
            while(c>k)
            {
                if(nums[start]==0)
                    c--;
                start++;
            }
            
            l=Math.max(l,i-start+1);
       
        }
        return l;
    }
}
