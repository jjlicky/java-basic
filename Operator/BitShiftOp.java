class BitShiftOp
{
	public static void main(String[] args)
	{
		System.out.println(2<<1);
		System.out.println(2<<2);
		System.out.println(2<<3);
		
		System.out.println(8>>1);
		System.out.println(8>>2);
		System.out.println(8>>3);

		System.out.println(-8>>1);
		System.out.println(-8>>2);
		System.out.println(-8>>3);
		// MSB가 1이면 >>연산에 따른 빈공간을 1로 채우고, MSB가 0이면 0으로 채움

		System.out.println(-8>>>1);
		// 빈공간을 무조건 0으로 채움
	}
}