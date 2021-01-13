class DecimalToBinary
{
	public static void main(String[] args)
	{
		toBinary(10);
	}

	public static int toBinary(int decimal)
	{
		if(decimal>0)
		{
			int bin;
			bin=decimal%2;
			decimal/=2;
			toBinary(decimal);
			System.out.println(bin);

		}
		return 0;
	}
}