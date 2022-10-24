https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/0

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int nums[], int n, int k) {
        // code here
                
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
