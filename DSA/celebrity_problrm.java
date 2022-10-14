
                                            https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1

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
