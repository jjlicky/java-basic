class Circle
{
	static final double PI=3.1415;
	private double radius;

	public Circle(double rad){radius = rad;}
	public void showPerimeter()
	{
		double peri = (radius*2)*PI;
		System.out.println("Perimeter is : "+peri);
	}
	public void showArea()
	{
		double area=(radius*radius)*PI;
		System.out.println("Area is : "+area);
	}
}

class ClassVarUse
{
	public  static void main(String[] args)
	{
		Circle c1=new Circle(1.2);
		c1.showPerimeter();
		c1.showArea();
	}
}