class MultiPle3
{
	public static void main(String[] args)
	{
		int sum=0;
		int i=1;
		while(true)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
			else if(i%2==0 && i%3==0)
			{
				sum+=i;
			}
			if(sum>1000)
				break;
		}
		System.out.println(sum);


	}
}