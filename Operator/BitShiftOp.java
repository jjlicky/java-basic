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
		// MSB�� 1�̸� >>���꿡 ���� ������� 1�� ä���, MSB�� 0�̸� 0���� ä��

		System.out.println(-8>>>1);
		// ������� ������ 0���� ä��
	}
}