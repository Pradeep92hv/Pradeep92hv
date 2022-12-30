
https://practice.geeksforgeeks.org/problems/single-valued-subtree/0


class Solution
{
    static int c=0;
    static boolean solve(Node root)
    {
        if(root==null)
        return true;
        if(root.left==null && root.right==null)
        {
            c++;
            return true;
        }
        
        
        boolean left=solve(root.left);
        boolean right=solve(root.right);
        
        int r=root.data,lt=r,rt=r;
       
        if(root.left!=null) lt=root.left.data;
        if(root.right!=null)  rt=root.right.data;
        
        if((left==right) && (lt==rt) && (r==lt))
        {
            c++;
            return true;
        }
        else
        return false;
        
    }
    public int singlevalued(Node root)
    {
        //code here
        solve(root);
        return c;
    }
}


------------------------------------------------
  
  
  

//User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Solution{
    int count=0;
    public int singlevalued(Node root){
        solve(root);
        return count;
    }    
    
    public int solve(Node node){
        if(node.left==null && node.right==null){
            count++;
            return node.data;
        }
        
        int c1=node.data, c2=node.data;
        if(node.left!=null)
            c1 = solve(node.left);
        if(node.right!=null)    
            c2 = solve(node.right); 
            
        if(c1==node.data && c2==node.data){
            count++;
            return node.data; 
        }
        
        return -1;
    }
}
