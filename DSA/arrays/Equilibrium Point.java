

https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&curated[]=1&sortBy=submissions

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {

        // Your code here
        if(n==1)
        return 1;
        
        long r=0,l=0;
        for(long x:a)
        r+=x;
        
        r-=a[0];
        
        for(int i=1;i<n;i++)
        {
            l+=a[i-1];
            r-=a[i];
            if(l==r)
            return (int)i+1;
        }
        return -1;
        
    }
}
