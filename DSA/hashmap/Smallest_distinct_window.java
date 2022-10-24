https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/0


class Solution {
    public int findSubString( String str) {
        // Your code goes here
        
 HashMap<Character,Integer> map = new HashMap<>();
	    HashSet<Character> set = new HashSet<>();
	    for(int i = 0 ; i < str.length(); i++){
	        char ch = str.charAt(i);
	        set.add(ch);
	    }
	    int ans = Integer.MAX_VALUE;
	   
	   int i=0,j=0;
	   
	   while(map.size()!=set.size() && i<str.length())
	     {
	         map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
	         i++;
	     }
	     ans=i;

	     j=0;
	       while(map.size()==set.size())
	          {
	               if(ans>=i-j+1)
	                { 
	                    ans = Math.min(ans,i - j );

	                }

	              int f=map.get(str.charAt(j));
	              if(f==1)
	                map.remove(str.charAt(j));
	                else
	                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)-1);
	                
	                j++;
	          }
	     while(i<str.length())
	     {
	          map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
	          
	          
	          while(map.size()==set.size())
	          {
	               if(ans>=i-j+1)
	                { 
	                  ans = Math.min(ans,i - j + 1);

	                }

	              int f=map.get(str.charAt(j));
	              if(f==1)
	                map.remove(str.charAt(j));
	                else
	                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)-1);
	                
	                j++;
	          }
	          i++;
	 
	     }
	    return ans;
    }
}









//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
        
 HashMap<Character,Integer> map = new HashMap<>();
	    HashSet<Character> set = new HashSet<>();
	    for(int i = 0 ; i < str.length(); i++){
	        char ch = str.charAt(i);
	        set.add(ch);
	    }
	    int ans = Integer.MAX_VALUE;
	    for(int i = 0, j = 0; i < str.length(); i++){
	        char ch = str.charAt(i);
	        map.put(ch,map.getOrDefault(ch,0) + 1);
	        while(map.size() == set.size() && j < str.length()){
	            char chj = str.charAt(j);
	            map.put(chj,map.get(chj) - 1);
	            if(map.get(chj) <= 0){
	                map.remove(chj);
	                ans = Math.min(ans,i - j + 1);
	            }
	            j++;
	        }
	    }
	    return ans;
    }
}
