
https://practice.geeksforgeeks.org/problems/reverse-a-stack/0

class Solution
{ 
    static void fun(Stack<Integer> s,int a)
    {
        Stack<Integer> st=new Stack<>();
        
        while(!s.isEmpty())
         st.push(s.pop());
        
        s.push(a);
        while(!st.isEmpty())
         s.push(st.pop());
    }
    static void rev(Stack<Integer> s)
    {
        if(s.isEmpty())
        return;
        int a=s.pop();
        rev(s);
     
       fun(s,a);    
    
    }
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        
        rev(s);
    }
}
