                      https://practice.geeksforgeeks.org/problems/reverse-a-stack/1

class Solution
{ 
    static void fun(Stack<Integer> s,int []a)
    {
        int i=0;
        while(!s.isEmpty())
        {
            a[i++]=s.pop();
        }
    }
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        int a[]=new int[s.size()];
        fun(s,a);
        for(int i=0;i<a.length;i++)
          s.push(a[i]);
    }
}
