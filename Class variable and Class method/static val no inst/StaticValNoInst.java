class InstCnt
{
	static int instNum=100;

	public InstCnt()
	{
		instNum++;
		System.out.println("Create instance : "+instNum);
	}
}

class StaticValNoInst
{
	public static void main(String[] args)
	{
		InstCnt.instNum-=15;
		System.out.println(InstCnt.instNum);
	}
}