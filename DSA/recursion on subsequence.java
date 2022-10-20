
static void fun(int i,int a[],Stack<Integer> l,int n)
	{
		if(i==n)
		{
			
				for(int x:l)
				{
					System.out.print(x+" ");
				}
			
				System.out.println("\n");
			
			
			return ;
		}
		l.push(a[i]);
				fun(i+1,a,l,n);
	    l.pop();
		
	fun(i+1,a,l,n);
		
		
	}
 
	
	public static void main(String[] args) {
		int []a= {3,1,2};
		Stack<Integer> l=new Stack();
		int n=3;
		fun(0,a,l,n);
		
	}
    
