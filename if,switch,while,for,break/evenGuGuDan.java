class evenGuGuDan
{
	public static void main(String[] args)
	{
		outerloop :
		for(int i=2;i<10;i++)
		{
			if(i%2!=0)
			continue;
			for(int j=1;j<10;j++)
			{
				System.out.println(i + "x" + j + " = " + i*j);
				if(i==j)
				break; 

			}
		}
	}
}