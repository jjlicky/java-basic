class LabledBreak
{
	public static void main(String[] args)
	{
		outerloop :
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.println("[" + i +", " +j + "]");
				if(i%2==0 && j%2==0)
				break outerloop; //outerloop이라고 표시된 반복문을 빠져나가겠다.

			}
		}
	}
}