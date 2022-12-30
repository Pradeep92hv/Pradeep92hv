https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/0




// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int a[]=new int[2];
       // int b[]=Arrays.copyOf(arr,n);
       int c[]=new int[n+1];
       for(int i=0;i<n;i++)
       {
           c[arr[i]]++;
       }
       
       for(int i=1;i<n+1;i++)
       {
           if(c[i]>1)
           {
               a[0]=i;
               
           }
           if(c[i]<1)
           a[1]=i;
       }
        return a;
        
    }
}
