https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/0



class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
           HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
           int sum=0;
           map.put(sum,map.getOrDefault(sum,0)+1);
           for(int i=0;i<arr.length;i++)
           {
               sum+=arr[i];
               if(map.getOrDefault(sum,0)>0)
               return true;
               map.put(sum,map.getOrDefault(sum,0)+1);
               
           }
           return false;
    }
}
