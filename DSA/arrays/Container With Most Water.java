https://practice.geeksforgeeks.org/problems/container-with-most-water0535/1


class Solve{
    
    long maxArea(int a[], int n){
        // Code Here
        int i=0,j=n-1;
        long max=0;
        
        while(i<j)
        {
            max=Math.max(Math.min(a[i],a[j])*(j-i),max);
            if(a[i]>a[j])
            j--;
            else if(a[i]<a[j])
            i++;
            else
            {
                i++;
                j--;
            }
        }
        return max;
    }
    
}
