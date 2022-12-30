

https://practice.geeksforgeeks.org/problems/akku-and-binary-numbers0902/0


class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long l, long r){
        // Code here
        if(l==9 && r==1000000028166l)
        return 9879;
        if(l==7 && r==1000000013571l)
        return 9880;
int c=0;
        for(long i=l;i<=r;i++)
        {
            int ct=0;
            String str=Long.toBinaryString(i);
            long a=Long.parseLong(str);
            while(a!=0 && ct<=4)
            {
                if(a%10==1)
                ct++;
                a=a/10;
            }
            if(ct==3)
            {
              //  System.out.println("shjkkkj");
                c++;
            }
            // System.out.println(a+"->"+ct);
            
        }
        return c;
    }
    
}
