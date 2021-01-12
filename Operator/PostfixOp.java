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
		System.out.println(num3);		//실행결과 증감연산자가 실행되긴하나 증가 이전 값을 대입한다.
		// 대입을 마친후에야 값이 적용된다.

		//두번째예시

		int num4 = 7, num5;
		num5 = (num1--)+5;			//괄호로 묶어주어도 결과는 달라지지않는다
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}