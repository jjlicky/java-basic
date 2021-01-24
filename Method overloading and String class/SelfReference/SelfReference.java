class SimplerAdder
{
	private int num;
	public SimplerAdder() {num=0;}

	public SimplerAdder add(int num)
	{
		this.num+=num;
		return this;
	}
	public void showResult()
	{
		System.out.println("add result : "+num);
	}
}

class SelfReference
{
	public static void main(String[] args)
	{
		SimplerAdder adder = new SimplerAdder();
		adder.add(1).add(3).add(5).showResult();
	}
}