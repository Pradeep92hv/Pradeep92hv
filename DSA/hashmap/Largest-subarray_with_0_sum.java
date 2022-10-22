
https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/0


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        int larg=0;
        int sum=0;
        map.put(sum,-1);    //sum ,index
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(map.containsKey(sum))
            {
               larg=Math.max((i-map.get(sum)),larg);
            }
            else
              map.put(sum,i);
              
        }
        return larg;
    }
}
