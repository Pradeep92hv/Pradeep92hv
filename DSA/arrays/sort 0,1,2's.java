
https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution
{
    static void swap(int a[], int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void sort012(int arr[], int n)
    {
        int i=0,start=0,end=n-1;
        
        while(i<=end)
        {
            if(arr[i]==0)
            {
                swap(arr,i,start);
                i++;
                start++;
            }
            else if(arr[i]==2)
            {
                 swap(arr,i,end);
                end--;
                
            }
            else
            i++;
        }
        
    }
}
