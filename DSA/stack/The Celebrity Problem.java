https://practice.geeksforgeeks.org/problems/the-celebrity-problem/0

class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int m[][], int n)
    {
    	// code here 
    	Stack<Integer> s=new Stack<Integer>();
    	
    	for(int i=0;i<n;i++)
    	s.push(i);
    	
    	while(s.size()>1)
    	{
    	    int a=s.pop();
    	    int b=s.pop();
    	    
    	    if(m[a][b]==1)
    	       s.push(b);
    	   else
    	       s.push(a);
    	}
  
    	
    	int x=s.pop();
    	
    	boolean rowcheck=false;
    	int c=0;
    	
    	for(int i=0;i<n;i++)
    	{
    	    if(m[x][i]==0)
    	    c++;
    	     
    	}
    	if(c==n)
    	rowcheck=true;
    	
    	boolean colCheck=false;
    	
    	c=0;
    	for(int i=0;i<n;i++)
    	{
    	    if(m[i][x]==1)
    	    c++;
    	}
    	if(c==n-1)
    	colCheck=true;
    	
    	if(rowcheck==true && colCheck==true)
    	return x;
    	else
    	return -1;
    	
    	
    	
    }
}







//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int a[][], int n)
    {
    	// code here 
      
         int f=-1;	
    	for(int i=0;i<n;i++)
    	{  f=i;
    	    for(int j=0;j<n;j++)
    	    {
    	        if(a[i][j]==1)
    	        {
    	           f=-1;
    	            break;
    	        }
    	    }
    	 //   System.out.println(f);
    	    if(f==i)
    	    {
    	        break;
    	    }
    	  //  System.out.println(i);
    	}
    //	System.out.println(f);
    	if(f==-1)
    	return -1;
    	else
    	{
    	    int flag=0;
    	    for(int j=0;j<n;j++)
    	    {
    	        if(j==f)
    	        continue;
    	        if(a[j][f]==0)
    	        {
    	            return -1;
    	        }
    	        
    	    }
    	    return f;
    	}
    }
}
