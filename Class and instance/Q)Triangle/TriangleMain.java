class Triangle
{
	int baseLine;
	int height;
	double size;

	public Triangle(int line, int height1)
	{
		baseLine=line;
		height=height1;
		size=baseLine*height/2;
	}
	public void showResult()
	{
		System.out.println("baseline : " + baseLine);
		System.out.println("height : " + height);
		System.out.println("size : " + size);

	}
}

class TriangleMain
{
	public static void main(String[] args)
	{
		Triangle tri = new Triangle(10, 17);
		
		tri.showResult();
	}
}