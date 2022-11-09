https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1

class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length())
        return false;
        int n=s1.length();
        for(int i=0;i<s1.length();i++)
        {
            String str=s1.substring(i+1,n);
            str+=s1.substring(0,i+1);
         
            if(str.equals(s2))
            return true;
        }
         return false;
    }
   
    
}
