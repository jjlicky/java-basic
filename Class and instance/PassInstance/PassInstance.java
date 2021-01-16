class Number
{
	int num=0;
	public void addNum(int n)
	{
		num+=n;
	}
	public int getNumber()
	{
		return num;
	}
}

class PassInstance
{
	public static void main(String[] args)
	{
		Number nInst=new Number();
		System.out.println("Before call method : "+nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("After call method : "+nInst.getNumber());
	}
	public static void simpleMethod(Number numb)
	{
		numb.addNum(12);
	}
}