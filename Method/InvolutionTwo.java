class InvolutionTwo
{
	public static void main(String[] args)
	{
		System.out.println("2^5 : " + invol(5));
		System.out.println("2^7 : " + invol(7));
	}

	public static int invol(int n)
	{
		if(n==0)
			return 1;
		return 2*invol(n-1);
	}
}