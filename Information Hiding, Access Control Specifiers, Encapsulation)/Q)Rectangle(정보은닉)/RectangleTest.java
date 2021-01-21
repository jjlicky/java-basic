class Rectangle
{
	int ulx, uly;
	int lrx, lry;

	private boolean isProperRange(int pos)
	{
		if(0<=pos && pos<=100)
			return true;
		else
			return false;
	}
	public void setRectanglePoint(int lx, int ly, int rx, int ry)
	{
		if(lx>=rx || ly>=ry)
		{
			System.out.println("Wrong Point.");
			return;
		}
		if(!isProperRange(lx) || !isProperRange(ly))
		{
			System.out.println("Left upper point is wrong.");
			return;
		}
		if(!isProperRange(rx) || !isProperRange(ry))
		{
			System.out.println("Right under point is wrong");
			return;
		}
		ulx = lx; uly=ly; lrx=rx; lry=ry;
	}

	public void showArea()
	{
		int xLen = lrx-ulx;
		int yLen = lry-uly;
		System.out.println("Area : "+(xLen*yLen));
	}
}

class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle();
		rec.setRectanglePoint(-3,-1,2,7);
		rec.showArea();

		rec.setRectanglePoint(2,2,8,8);
		rec.showArea();
	}
}