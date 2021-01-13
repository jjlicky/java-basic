class PrimeNum
{
	public static void main(String[] args)
	{
		for(int i=1; i<101; i++)
		{
			if(prime(i))
				System.out.println(i);

		}

	}

	public static boolean prime(int a)
	{
		if(a==1)
		return false;
		for(int i=2;i<a;i++)
		{	
			if(a%i==0)
			return false;
		}
		return true;
	}
}