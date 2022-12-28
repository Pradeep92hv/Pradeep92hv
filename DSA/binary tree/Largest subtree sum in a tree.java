https://practice.geeksforgeeks.org/problems/largest-subtree-sum-in-a-tree/1




class Solution {
    
    static int ans = Integer.MIN_VALUE;
    
    private static int rec(Node root)
    {
        if(root==null) return 0;
        
        int left_tree  = rec(root.left);
        int right_tree = rec(root.right);
        
        int include = root.data + left_tree + right_tree;
        
        ans = Math.max(ans, include);
        
        return include;
    }
    
    public static int findLargestSubtreeSum(Node root) {
        
        ans = Integer.MIN_VALUE;
        
        rec(root);
        
        return ans;
        
        
    }
}









----------------
  

/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/


class Solution {
     // Function to find largest subtree sum.
    static int solve(Node root,ArrayList<Integer> al)
    {
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        {
            al.add(root.data);
            return root.data;
        };
        
        
        
        int left=0;
        int right=0;

        left=solve(root.left,al);
         
        right=solve(root.right,al);
      
       int ans= left+right+root.data;
        al.add(ans);
    return ans;
     
    }
    public static int findLargestSubtreeSum(Node root) {
        // code here
        if(root.left==null && root.right==null)
        return root.data;
        ArrayList<Integer> al=new ArrayList<>();
     int pp=solve(root,al);
     
    int tem=-10;
    
    for(int x:al)
    {
        if(tem<x)
        tem=x;
    }
     return tem;
    }
}
        
        
