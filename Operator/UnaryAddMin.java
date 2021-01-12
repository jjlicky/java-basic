class UnaryAddMin
{
	public static void main(String[] args)
	{
		int n1 = 5;
		System.out.println(+n1);
		System.out.println(-n1);

		short n2 = 7;
		int n3 = +n2;		// +연산을 함으로써 int형으로 자동 변환되므로 n3는 int형이어야만 한다.
		int n4 = -n2;
		System.out.println(n3);			
		System.out.println(n4);	

	}
}