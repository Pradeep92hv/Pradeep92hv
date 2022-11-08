https://practice.geeksforgeeks.org/problems/uncommon-characters4932/1


class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
         int c[]=new int[26];
         String str="";
         for(int i=0;i<A.length();i++)
         {
             c[A.charAt(i)-97]=1;
         }
         int d[]=new int[26];
         for(int i=0;i<B.length();i++)
         d[B.charAt(i)-97]=1;
         
         for(int i=0;i<26;i++)
         {
             if(c[i]!=d[i])
             
             str+=(char)(i+97);
         }
         if(str=="")
         return str+=-1;
         return str;
    }
}
