
                                  https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1


class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> s=new Stack<Integer> ();
	    s.push(-1);
	    int ans[]=new int[n];
	    
	    for(int i=n-1;i>=0;i--)
	    {
	        int y=arr[i];
	  
	        
	        while(arr[i]<=s.peek())
	        {
	            s.pop();
	        }
	        ans[i]=s.peek();
	        s.push(y);
	    }
	    return ans;
	} 
}
