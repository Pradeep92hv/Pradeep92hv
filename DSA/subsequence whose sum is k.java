	static void fun(int i,int a[],Stack<Integer> l,int n,int s,int sum)
	{
		if(i==n)
		{
			//System.out.println(sum);
			if(s==sum)
			{
				for(int x:l)
				{
					System.out.print(x+" ");
				}
			
				System.out.println("\n");
			}
			
			return ;
		}
		l.push(a[i]);
		sum+=a[i];
		fun(i+1,a,l,n,s,sum);
		sum-=a[i];
	    l.pop();
		
	fun(i+1,a,l,n,s,sum);
		
		
	}
 
	public static void main(String[] args)
	{
		int []a= {1,2,1};
		Stack<Integer> l=new Stack();
		int n=3,s=2,sum=0;
		fun(0,a,l,n,s,sum);
	}
