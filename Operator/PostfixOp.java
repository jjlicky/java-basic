class PostfixOp
{
	public static void main(String[] args)
	{
		int num1 = 7;
		int num2, num3;

		num2 = num1++;
		num3 = num1--;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);		//������ ���������ڰ� ����Ǳ��ϳ� ���� ���� ���� �����Ѵ�.
		// ������ ��ģ�Ŀ��� ���� ����ȴ�.

		//�ι�°����

		int num4 = 7, num5;
		num5 = (num1--)+5;			//��ȣ�� �����־ ����� �޶������ʴ´�
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}