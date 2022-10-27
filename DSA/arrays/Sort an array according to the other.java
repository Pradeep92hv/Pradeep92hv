
https://practice.geeksforgeeks.org/problems/relative-sorting4323/1?page=2&curated[]=1&sortBy=submissions

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int a1[], int n, int a2[], int m)
    {
        //Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int x:a1)
        map.put(x,map.getOrDefault(x,0)+1);
        ArrayList<Integer> p=new ArrayList<>();
        for(int x:a1)
        p.add(x);
        
         ArrayList<Integer> q=new ArrayList<>();
        for(int x:a2)
        q.add(x);
        
        p.removeAll(q);
        
    ;
        
        int b[]=new int[n],i=0;
        
        for(int x:a2)
        {
            while(map.containsKey(x))
            {
                b[i++]=x;
                int f=map.get(x);
                if(f==1)
                map.remove(x);
                else
                 map.put(x,map.getOrDefault(x,0)-1);
                
            }
        }
        Collections.sort(p);
        for(int x:p)
        {
            b[i++]=x;
        }
        return b;
    }
}
