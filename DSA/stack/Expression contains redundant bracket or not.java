https://practice.geeksforgeeks.org/problems/e015cb4d3f354b035d9665e7c8a54a7aefb1901b/0


class Solution {
    public static int checkRedundancy(String s) {
        // code here
        
        Stack<Character> st=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(c!=')')
            st.push(c);
            else if(c==')')
            {
                int flag=0;
                
                while(st.peek()!='(')
                {
                  
                    if(st.peek()=='+' || st.peek()=='-' ||st.peek()=='/' ||st.peek()=='*')
                    {
                        flag=1;
                        
                    }
                    st.pop();
                }
                
              
                if(flag==0)
                {
                    
                
                    return 1;
                }
                  st.pop();
               
            }
        }
        return 0;
        
    }
}
        
