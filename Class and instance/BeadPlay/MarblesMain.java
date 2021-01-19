class ChildProperty
{
	int numOfBead;
;
	public ChildProperty(int bead)
	{
		numOfBead=bead;
	}

	public void obtainBead(ChildProperty child, int obtainCount)
	{
		int obtainBeadCount=child.loseBead(obtainCount);
		numOfBead+=obtainBeadCount;
	}

	public int loseBead(int loseCount)
	{
		if(numOfBead<loseCount)
		{
			int retValue=numOfBead;
			numOfBead=0;
			return retValue;
		}
		numOfBead-=loseCount;
		return loseCount;
	}
	public void showProperty()
	{
		System.out.println("The number of own beads : "+ numOfBead);
	}
}

class MarblesMain
{
	public static void main(String[] args)
	{
		ChildProperty child1 = new ChildProperty(15);
		ChildProperty child2 = new ChildProperty(9);

		System.out.println("The number of own beads before game");
		System.out.println("Child1*********");
		child1.showProperty();
		System.out.println("Child2*********");
		child2.showProperty();

		child1.obtainBead(child2, 2);  //first game, child1 get 2 beads from Child2

		child2.obtainBead(child1,7);

		System.out.println("");
		System.out.println("The number of own beads after game");
		System.out.println("Child1*********");
		child1.showProperty();
		System.out.println("Child2*********");
		child2.showProperty();
	}
}