https://practice.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1


class Solution
{ 
    // Method to calculate distinct sub-array 
    static int countDistinctSubarray(int arr[], int n) 
    { 
     HashSet<Integer> set=new HashSet<>();
     HashMap<Integer,Integer> map=new HashMap<>();
     
     for(int x:arr)
     set.add(x);
     // System.out.println(set.size());
     int c=0,j=0;
     for(int i=0;i<arr.length;i++)
     {
         int x=arr[i];
         map.put(x,map.getOrDefault(x,0)+1);
         
       
         while(map.size()==set.size())
         {
               
               
                c+=arr.length-i;
             
             x=arr[j];
             if(map.get(x)>1)
             map.put(x,map.getOrDefault(x,0)-1);
             else
             map.remove(x);
             
             j++;
         }
     }
     return c;
    }
}
