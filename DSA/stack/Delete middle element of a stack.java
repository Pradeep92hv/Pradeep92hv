https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/0

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int n=s.size()/2;
        Stack<Integer> temp=new Stack<>();
        
        for(int i=0;i<=n;i++)
        {
            temp.push(s.pop());
        }
        temp.pop();
    while(!temp.isEmpty())
       s.push(temp.pop());
       
     
    } 
}







class Solution
{
    void rem(Stack<Integer>s,int n,int c)
    {
        if(c==n/2)
        {
            s.pop();
            return;
        }
        int i=s.pop();
        rem(s,n,c+1);
        s.push(i);
    }
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int n){
        // code here
        
        int c=0;
        rem(s,n,c);
        
    } 
}
