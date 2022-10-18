
        https://practice.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/1

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
