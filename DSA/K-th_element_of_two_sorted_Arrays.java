

                                      https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?page=2&curated[]=1&sortBy=submissions

class Solution {
    public long kthElement( int a[], int b[], int n, int m, int kk) {
       
       int i=0,j=0,k=0;
       int r[]=new int[n+m];
       while(i<n && j<m)
       {
           if(a[i]>b[j])
            r[k++]=b[j++];
            else if(a[i]<b[j])
              r[k++]=a[i++];
              else
              {
                  r[k++]=a[i++];
                  r[k++]=b[j++];
              }
       }
       while(i<n)
       r[k++]=a[i++];
       while(j<m)
       r[k++]=b[j++];
       
       return r[kk-1];
    }
}
