
                                          https://practice.geeksforgeeks.org/problems/sort-a-stack/1

class GfG{
    
    static void fun(Stack<Integer> s,Stack<Integer> s1)
    {
        while(!s.isEmpty())
        {
            int a=s.pop();
            
            while(!s1.isEmpty() && s1.peek()>a)
            {
                s.push(s1.pop());
            }
            s1.push(a);
        }
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> s11=new Stack<Integer>();
		
		fun(s,s11);
		return s11;
	}
}
