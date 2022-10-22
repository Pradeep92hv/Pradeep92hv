https://practice.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/0



class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
         String a=Integer.toBinaryString(n);
         HashMap<Integer,Integer> map=new HashMap<>();
         map.put(0,-1);    // value,index
         int max=0;
         int i;
         for(i=0;i<a.length();i++)
         {
             
             if(a.charAt(i)=='0')
             {
             max=Math.max(max,i-map.get(0)-1);
             
             map.put(0,i);
             }
           
             
         }
         max=Math.max(max,i-map.get(0)-1);
         
     return max;   
    }
}




class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        String a=Integer.toBinaryString(N);
        int l=0,c=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='1')
            c++;
            else
            {
                l=Math.max(c,l);
                c=0;
            }
            
        }
         l=Math.max(c,l);
        
        return l;
        
    }
}
