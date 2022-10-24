https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/0

 class Solution{
  
        static boolean ispossible(int[] arr, int n, int k,long mid)
        {
            int man=1;
        long paintersum=0;
         for(int i=0; i<n; i++)
             {

             if(paintersum+arr[i]<=mid)

             {

                 paintersum+=arr[i];

             }

             else

             {

             man++;

             if(man>k || arr[i]>mid)

             {

                 return false;

             }

             paintersum=arr[i];

            }

        }

        return true;

     }

    static long minTime(int[] arr,int n,int k){

          long s=0;

         long e=0;

         long ans=0;

          for(int i=0; i<n;i++)

          {

              e+=arr[i];

          }
            long  mid=s+(e-s)/2;



          while(s<=e)
        {
              if(ispossible(arr,n,k,mid))
             {
                 ans=mid;
                  e=mid-1;
              }

              else

              s=mid+1;

              mid=s+(e-s)/2;

          }

          return ans;

    }

 }
        //code here



