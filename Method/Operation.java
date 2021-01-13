class Operation
{
	public static void main(String[] args)
	{
		plus(1,9);
		minus(19,3);
		multiple(3,5);
		divide(9,6);
	}

	public static  void plus(int a, int b)
	{
		System.out.println(a+"+"+b+"="+(a+b));
 	}

	public static  void minus(int c, int d)
	{
		System.out.println(c+"-"+d+"="+(c-d));
 	}
	public static  void multiple(int e, int f)
	{
		System.out.println(e+"x"+f+"="+(e*f));
 	}
	public static  void divide(int g, int h)
	{
		System.out.println("¸ò :"+g+"/"+h+"="+(g/h));
		System.out.println("³ª¸ÓÁö :"+g+"%"+h+"="+(g%h));
 	}
}