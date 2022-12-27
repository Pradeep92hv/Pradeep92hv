https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1?page=2&curated[]=1&sortBy=submissions




class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int[] span=new int[price.length];
        Stack<Integer> S=new Stack<>();
        S.push(0);
        span[0]=1;
        
        for(int i=1;i<price.length;i++){
            while(S.size()>0 && price[i]>=price[S.peek()]){
                S.pop();
            }
            if(S.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=i-S.peek();
            }
            S.push(i);
        }
 
        return span;
    }
    
}
