https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/0



class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int c=0,larg=0;
        map.put(c,-1);
        
        for(int i=0;i<N;i++)
        {
            if(arr[i]==1)
            c++;
            else
            c--;
        
        if(map.containsKey(c))
        {
            larg=Math.max(larg,i-map.get(c));
        }
        else
        map.put(c,i);
        }
        return larg;
    }
}
