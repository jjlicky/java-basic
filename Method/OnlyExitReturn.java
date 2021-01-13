class OnlyExitReturn
{
	public static void main(String[] args)
	{
		divide(4,2);
		divide(6,2);
		divide(9,0);
	}

	public static void divide(int a, int b)
	{
		if(b==0)
		{
			System.out.println("0으로는 값을 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 : " + (a/b));

 	}
}