
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







class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	  int i=0;
	    int ans[]=new int[n];
	    for( i=0;i<n-1;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                ans[i]=arr[j];
	                break;
	            }
	            ans[i]=-1;
	        }
	        
	    }
	    ans[i]=-1;
	    return ans;
	} 
}

