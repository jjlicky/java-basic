class Circle
{
	public static void main(String[] args)
	{
		double Area=area(3);
		double Peri=perimeter(4);
		System.out.println(Area);
		System.out.println(Peri);

	}

	public static double area(int a)
	{
		return a*a*3.14;
	}
	public static double perimeter(int b)
	{
		return 2*3.14*b;
	}
}