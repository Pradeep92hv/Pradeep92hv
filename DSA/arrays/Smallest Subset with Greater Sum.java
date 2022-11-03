
https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1?page=2&category[]=Arrays&category[]=Strings&curated[]=1&curated[]=7&sortBy=submissions

ass Solution { 
    int minSubset(int[] arr,int N) { 
        Arrays.sort(arr);
        long s=0;
        for(int x:arr)
        s+=x;
        
        long k=(long)s/2;
        
        int i=N-1,c=0;
        long t=0;
        while(k>=t)
        {
            t+=(long)arr[i];
            i--;
            c++;
        }
        return c;
    }
}
