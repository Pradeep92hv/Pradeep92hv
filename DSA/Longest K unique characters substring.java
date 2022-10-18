

https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1#:~:text=Given%20a%20string%20you%20need%20to%20print%20the,is%20the%20longest%20substring%20with%20K%20distinct%20characters.



class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0,i=0,l=-1;
        for( i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.size()>k && i>=j)
            {
               char ch=s.charAt(j);
                if(map.get(ch)==1)
                  map.remove(ch);
                  else
                 map.put(ch,map.get(ch)-1);
                 
                 j++;
            }
            if(map.size()==k)
            l=Math.max(l,i-j+1);
            
        }
         
        
        return l;
    }
}
