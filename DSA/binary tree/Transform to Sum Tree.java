
https://practice.geeksforgeeks.org/problems/d7e0ce338b11f0be36877d9c35cc8dfad6636957/1

class Solution{
    public void toSumTree(Node root){
         //add code here.
            int ans=sum(root);
    }
    public int sum(Node root){
       
        if(root.left==null&&root.right==null){
           int temp=root.data;
            root.data=0;
            return temp;
        }
        int temp=root.data;
        int a=0,b=0;
        if(root.left!=null)a=sum(root.left);
        if(root.right!=null)b=sum(root.right);
        root.data=a+b;
        return temp+root.data;
    }
}
