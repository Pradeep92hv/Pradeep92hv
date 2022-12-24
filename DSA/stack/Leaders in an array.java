https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n){
        // Your code here
        Stack<Integer> s=new Stack<>();
        
        ArrayList<Integer> al=new ArrayList<>();
        al.add(a[n-1]);
        s.add(a[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(s.peek()<=a[i])
            {
                s.push(a[i]);
                al.add(a[i]);
            }
            
            
        }
        Collections.reverse(al);
        return al;
    }
}
