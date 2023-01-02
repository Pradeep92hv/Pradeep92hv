https://practice.geeksforgeeks.org/problems/ec277982aea7239b550b28421e00acbb1ea03d2c/1



//User function Template for Java
/*
Tree node structure  used in the program
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static void solve(Node root,ArrayList<Integer> a,int i)
    {
        if(root==null) return;
        if(a.size()>i)
        {
            if(root.data>a.get(i))
            a.set(i,root.data);
        }
        else
        {
            a.add(i,root.data);
        }
        solve(root.left,a,i+1);
        solve(root.right,a,i+1);
    }
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       ArrayList<Integer> a=new ArrayList<>();
       solve(node,a,0);
       return a;
    }
}
