https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/0




class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        // code here 
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
   
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        for(int i=0;i<k-1;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        for(int i=k-1;i<n;i++)
        {
             map.put(a[i],map.getOrDefault(a[i],0)+1);
             al.add(map.size());
             int f=map.get(a[i-k+1]);
             if(f==1)
             map.remove(a[i-k+1]);
             else
             map.put(a[i-k+1],map.getOrDefault(a[i-k+1],0)-1);
        }
        return al;
    }
}

