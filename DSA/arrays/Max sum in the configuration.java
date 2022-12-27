

https://practice.geeksforgeeks.org/problems/max-sum-in-the-configuration/1?page=3&difficulty[]=1&category[]=Arrays&sortBy=submissions


class GfG
{
    int max_sum(int a[], int n)
    {
	// Your code here
	int sum=0,pro=0;
	
	for(int i=0;i<n;i++)
	{
	    sum+=a[i];
	    pro+=i*a[i];
	}
	int cur=pro;
	for(int i=1;i<n;i++)
	{
	    pro=Math.max(pro,pro+sum-n*a[n-i]);
	   
	   //pro=pro+sum-a[n-i]*n;
	   
	   //cur=Math.max(pro,cur);
	}
	return pro;
    }	
}
