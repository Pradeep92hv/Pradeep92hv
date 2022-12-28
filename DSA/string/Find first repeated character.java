

https://practice.geeksforgeeks.org/problems/find-first-repeated-character4108/1?page=1&category[]=Strings&curated[]=1&sortBy=submissions

class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        int a[]=new int[26];
        
     Arrays.fill(a,0);
        for(int i=0;i<s.length();i++)
        {
            
            char c=s.charAt(i);
            
            if(a[c-'a']>0)
            {
                a[c-97]++;
               String st=""+c;
                return st;
            }
            else
            a[c-'a']++;
          
        }
       String st=""+(-1);
        return st ;
    }
} 
