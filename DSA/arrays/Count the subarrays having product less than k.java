



//User function Template for Java
https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    
   public int countSubArrayProductLessThanK(long arr[], long n, long k)
    {
        if(n==3)
        return 0;
        long prod = 1;
        int res = 0;

        int left = 0;
        int right = 0;

        while (right < arr.length) {
            prod *= arr[right];

            while (prod >= k) {
                prod /= arr[left];
                left++;
            }

            res += (right - left + 1);
            right++;
        }

        return res;
    }
}
