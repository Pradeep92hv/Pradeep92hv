



https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=2&curated[]=1&sortBy=submissions

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int a[], int n, int k)
    {
        // Your code here
      
       PriorityQueue<Integer> q= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
          q.add(a[i]);
          ArrayList<Integer> al=new ArrayList<>();
          
          al.add(q.peek());
          q.remove(a[0]);
          int j=1;
          for(int i=k;i<n;i++)
          {
              q.add(a[i]);
              al.add(q.peek());
              q.remove(a[j++]);
              
          }
          return al;
    }
}
