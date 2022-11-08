https://practice.geeksforgeeks.org/problems/maximize-toys0331/1


class Solution{
    static int toyCount(int N, int k, int arr[])
    {
        // code here
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<N;i++)
        {
            if(k>=arr[i])
            {
                k-=arr[i];
                c++;
            }
            else
            break;
        }
        return c;
    }
}
