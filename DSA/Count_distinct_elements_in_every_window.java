                            https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int p=0;
        for(p=0;p<k;p++)
        {
            map.put(a[p],map.getOrDefault(a[p],0)+1);
        }
         al.add(map.size());
        int j=0;
        for(int i=k;i<n;i++)
        {
                     
                        
                   j=i-k;
                   int f=map.get(a[j]);
                   
                   if(f==1)
                   map.remove(a[j]);
                   else
                   map.put(a[j],f-1);
                   

                   
                     map.put(a[i],map.getOrDefault(a[i],0)+1);
                     al.add(map.size());
                        
                        
        }
        return al;
    }
}

