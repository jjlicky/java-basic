class RightRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int n)
	{
		System.out.println("Hi");

		if(n==1)
			return;
		showHi(--n);
	}
}