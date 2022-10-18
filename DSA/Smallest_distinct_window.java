                                      https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article



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
      
      
      
      
      
      class Solution {
    public int findSubString( String str) {
        // Your code goes here
        
        HashSet<Character> map=new HashSet<>();
        int len=str.length();
        
        for(int i=0;i<str.length();i++)
          map.add(str.charAt(i));
          
         int i=-1,j=-1;
         HashMap<Character,Integer> map1=new HashMap<>();
         while(true)
         {
             boolean f1=false,f2=false;
             
             while(i<str.length()-1 && map1.size()<map.size())
             {
                 i++;
                 map1.put(str.charAt(i),map1.getOrDefault(str.charAt(i),0)+1);
                 f1=true;
             }
             
             while(j<i && map.size()==map1.size())
             {
              int plen=i-j;
             
             if(plen<len)
             len=plen;
              
              j++;
              
              char c=str.charAt(j);
              
              if(map1.get(c)==1)
              map1.remove(c);
              else
              {
                  map1.put(c,map1.get(c)-1);
              }
              
              f2=true;
             }
             if(f1==false && f1==false)
             break;
             
         }
         return len;
    }
}
